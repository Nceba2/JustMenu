package Model;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.FileOutputStream;
import java.io.IOException;

public class PDFWriter implements IPDFWriter {

    @Override
    public void doWrite(String header, String Message, String newFile) throws IOException, DocumentException{
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("src/main/webapp/Lib/data/"+newFile+".pdf"));
        Image img = Image.getInstance("src/main/webapp/Lib/img/logo-white.png");

        document.open();
        Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14, BaseColor.RED);
        Font font1 = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14, BaseColor.BLACK);
        Font font2 = FontFactory.getFont(FontFactory.COURIER, 8, BaseColor.BLACK);

        Chunk chunk = new Chunk("PAID", font);
        Chunk chunk1 = new Chunk(header, font1);
        Chunk chunk2 = new Chunk(Message, font2);

        document.addTitle("Statement");
        document.addAuthor("Made by Giant");

        document.add(img);
        document.add(new Paragraph(chunk));
        document.add(new Paragraph(chunk1));
        document.add(new Paragraph(chunk2));

        document.setHtmlStyleClass("body{background: red;}");
        document.close();
    }

    @Override
    public String doRead(String filename) throws IOException {
        PdfReader reader = new PdfReader("src/main/webapp/Lib/data/"+filename+".pdf");
        return String.valueOf(PdfTextExtractor.getTextFromPage(reader, 1));
    }
}
