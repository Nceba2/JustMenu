import Model.IStatementGenerator;
import Model.StatementGenerator;
import com.itextpdf.text.DocumentException;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class StementGenerator_tests {

    private JSONArray productNames;
    private JSONArray productPrices;
    private int TotalPrice;
    private String user;

    @Before
    public void initialValues() throws ParseException {
        JSONParser parser= new JSONParser();
        this.productNames =(JSONArray) parser.parse("[\"Regular Kota\",\"Regular part2 Kota\"]");
        this.productPrices =(JSONArray) parser.parse("[\"10\",\"20\"]");
        this.TotalPrice = 30;
        this.user = "Paul";
    }

    @Test
    public void  StatementCreationTest() throws IOException, DocumentException {
        IStatementGenerator statementGenerator = new StatementGenerator();
        statementGenerator.setStatement(productNames,productPrices,TotalPrice, user);

        assertNotNull(statementGenerator.getStatement());
    }

    @Test
    public void  StatementCreation_NullProductNamesTest() throws IOException, DocumentException {
        String expact = "PAID\n"+ user +" Statement\n \nItem names or prices are null";
        IStatementGenerator statementGenerator = new StatementGenerator();
        statementGenerator.setStatement(null,productPrices,TotalPrice, user);

        assertEquals(expact,statementGenerator.getStatement());
    }

    @Test
    public void  StatementCreation_NullProductPricesTest() throws IOException, DocumentException {
        String expact = "PAID\n"+ user +" Statement\n \nItem names or prices are null";
        IStatementGenerator statementGenerator = new StatementGenerator();
        statementGenerator.setStatement(productNames,null,TotalPrice, user);

        assertEquals(expact,statementGenerator.getStatement());
    }

    @Test
    public void  StatementCreation_NullProductPricesAndNamesTest() throws IOException, DocumentException {
        String expact = "PAID\n"+ user +" Statement\n \nItem names or prices are null";
        IStatementGenerator statementGenerator = new StatementGenerator();
        statementGenerator.setStatement(null,null,TotalPrice, user);

        assertEquals(expact,statementGenerator.getStatement());
    }
    @Test
    public void  StatementCreation_NullTotalPriceTest() throws IOException, DocumentException {
        String expact = "PAID\n"+ user +" Statement\n \nItem names or prices are null";
        IStatementGenerator statementGenerator = new StatementGenerator();
        statementGenerator.setStatement(productNames,productPrices,0, user);

        assertEquals(expact,statementGenerator.getStatement());
    }
    @Test
    public void  StatementCreation_NullValuesTest() throws IOException, DocumentException {
        String expact = "PAID\n"+ user +" Statement\n \nItem names or prices are null";
        IStatementGenerator statementGenerator = new StatementGenerator();
        statementGenerator.setStatement(null,null,0, user);

        assertEquals(expact,statementGenerator.getStatement());
    }
}
