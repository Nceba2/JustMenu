package Model;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PDFWriter implements IPDFWriter {

    @Override
    public void doWrite(String header, String Message, String newFile) throws FileNotFoundException, DocumentException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("src/main/webapp/Lib/data/"+newFile+".pdf"));
        String IMAGE = "src/main/webapp/Lib/img/blog-1-1000x400.jpg";

        document.open();
        Font font = FontFactory.getFont(FontFactory.COURIER, 8, BaseColor.BLACK);
        Chunk chunk = new Chunk(Message, font);

        Font font2 = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14, BaseColor.BLACK);
        Chunk chunk2 = new Chunk(header, font2);

        document.add(new Paragraph(chunk2));
        document.add(new Paragraph(chunk));
        document.setHtmlStyleClass("body{background: red;}");
        document.close();
    }

    @Override
    public String doRead(String filename) throws IOException {
        PdfReader reader = new PdfReader("src/main/webapp/Lib/data/"+filename+".pdf");
        return String.valueOf(PdfTextExtractor.getTextFromPage(reader, 1));
    }
}
