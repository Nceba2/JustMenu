package Model;

import com.itextpdf.text.DocumentException;
import org.json.simple.JSONArray;
import java.io.IOException;

public interface IStatementGenerator {
    void setStatement(JSONArray productNames, JSONArray productPrices, int totalPrice) throws IOException, DocumentException;

    String getStatement() throws IOException;
}
