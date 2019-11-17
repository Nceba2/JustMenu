import Model.IPDFWriter;
import Model.IStatementGenerator;
import Model.PDFWriter;
import Model.StatementGenerator;
import com.itextpdf.text.DocumentException;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class StementGeneratorTest {

    private JSONArray productNames;
    private JSONArray productPrices;
    private int TotalPrice;

    @Before
    public void initialValues() throws ParseException {
        JSONParser parser= new JSONParser();
        this.productNames =(JSONArray) parser.parse("[\"Regular Kota\",\"Regular part2 Kota\"]");
        this.productPrices =(JSONArray) parser.parse("[\"10\",\"20\"]");
        this.TotalPrice = 30;
    }

    @Test
    public void  StatementCreationTest() throws IOException, DocumentException {
        IStatementGenerator statementGenerator = new StatementGenerator();
        statementGenerator.setStatement(productNames,productPrices,TotalPrice);

        assertNotNull(statementGenerator.getStatement());
    }

    @Test
    public void  StatementCreation_NullProductNamesTest() throws IOException, DocumentException {
        String expact = "PAID\nNceba Statement\n \nItem names or prices are null";
        IStatementGenerator statementGenerator = new StatementGenerator();
        statementGenerator.setStatement(null,productPrices,TotalPrice);

        assertEquals(expact,statementGenerator.getStatement());
    }

    @Test
    public void  StatementCreation_NullProductPricesTest() throws IOException, DocumentException {
        String expact = "PAID\nNceba Statement\n \nItem names or prices are null";
        IStatementGenerator statementGenerator = new StatementGenerator();
        statementGenerator.setStatement(productNames,null,TotalPrice);

        assertEquals(expact,statementGenerator.getStatement());
    }

    @Test
    public void  StatementCreation_NullProductPricesAndNamesTest() throws IOException, DocumentException {
        String expact = "PAID\nNceba Statement\n \nItem names or prices are null";
        IStatementGenerator statementGenerator = new StatementGenerator();
        statementGenerator.setStatement(null,null,TotalPrice);

        assertEquals(expact,statementGenerator.getStatement());
    }
    @Test
    public void  StatementCreation_NullTotalPriceTest() throws IOException, DocumentException {
        String expact = "PAID\nNceba Statement\n \nItem names or prices are null";
        IStatementGenerator statementGenerator = new StatementGenerator();
        statementGenerator.setStatement(productNames,productPrices,0);

        assertEquals(expact,statementGenerator.getStatement());
    }
    @Test
    public void  StatementCreation_NullValuesTest() throws IOException, DocumentException {
        String expact = "PAID\nNceba Statement\n \nItem names or prices are null";
        IStatementGenerator statementGenerator = new StatementGenerator();
        statementGenerator.setStatement(null,null,0);

        assertEquals(expact,statementGenerator.getStatement());
    }
}
