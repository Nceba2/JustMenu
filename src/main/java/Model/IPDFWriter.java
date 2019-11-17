package Model;

import com.itextpdf.text.DocumentException;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IPDFWriter {

    void  doWrite(String header, String Message,String newFile) throws FileNotFoundException, DocumentException;

    String doRead(String filename) throws IOException;
}
