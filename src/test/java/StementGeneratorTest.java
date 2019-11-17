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

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StementGeneratorTest {

    private JSONArray productNames;
    private JSONArray productPrices;
    private int TotalPrice;
    private String message,header;

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
        System.out.println(statementGenerator.getStatement());

        assertNotNull(statementGenerator.getStatement());
    }

    @Test
    public void PDFWriterTest() throws IOException, DocumentException {
        header = "test";
        message = "hello test";
        IPDFWriter pdfWriter = new PDFWriter();
        pdfWriter.doWrite(header, message,"test");

        assertEquals(message,pdfWriter.doRead("test"));
    }
}
