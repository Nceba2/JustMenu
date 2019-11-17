import Model.IPDFWriter;
import Model.PDFWriter;
import com.itextpdf.text.DocumentException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class PDFWriter_tests {
    private String message,header;

    @Test
    public void PDFWriterTest() throws IOException, DocumentException {
        header = "test";
        message = "hello test";
        String expect = "PAID\n"+header+"\n"+message;

        IPDFWriter pdfWriter = new PDFWriter();
        pdfWriter.doWrite(header, message,"test");

        assertEquals(expect,pdfWriter.doRead("test"));
    }
    @Test
    public void PDFWriterNullHeaderTest() throws IOException, DocumentException {
        header = null;
        message = "hello test";
        String expect = "PAID\n"+"null"+"\n"+"null";

        IPDFWriter pdfWriter = new PDFWriter();
        pdfWriter.doWrite(header, message,"test");

        assertEquals(expect,pdfWriter.doRead("test"));
    }
    @Test
    public void PDFWriterNullMessageTest() throws IOException, DocumentException {
        header = "Test";
        message = null;
        String expect = "PAID\n"+"null"+"\n"+"null";

        IPDFWriter pdfWriter = new PDFWriter();
        pdfWriter.doWrite(header, message,"test");

        assertEquals(expect,pdfWriter.doRead("test"));
    }
    @Test
    public void PDFWriterNullFilenameTest() throws IOException, DocumentException {
        header = "test";
        message = "hello test";
        String expect = "PAID\n"+header+"\n"+message;

        IPDFWriter pdfWriter = new PDFWriter();
        pdfWriter.doWrite(header, message,null);

        assertEquals(expect,pdfWriter.doRead(null));
    }
    @Test
    public void PDFWriterNullHeaderAndMessageTest() throws IOException, DocumentException {
        header = null;
        message = null;
        String expect = "PAID\n"+"null"+"\n"+"null";

        IPDFWriter pdfWriter = new PDFWriter();
        pdfWriter.doWrite(header, message,"test");

        assertEquals(expect,pdfWriter.doRead("test"));
    }
    @Test
    public void PDFWriterNullValuesTest() throws IOException, DocumentException {
        header = null;
        message = null;
        String expect = "PAID\n"+"null"+"\n"+"null";

        IPDFWriter pdfWriter = new PDFWriter();
        pdfWriter.doWrite(header, message,null);

        assertEquals(expect,pdfWriter.doRead(null));
    }
}
