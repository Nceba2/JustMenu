package Model;

import com.itextpdf.text.DocumentException;
import org.json.simple.JSONArray;
import java.io.IOException;

public class StatementGenerator implements IStatementGenerator {
    private String _Message,_header, userID;

    IPDFWriter pdfWriter;

    @Override
    public void setStatement(JSONArray productNames, JSONArray productPrices, int totalPrice, String user) throws IOException, DocumentException {
            //set the values an feeback of the statement
            pdfWriter = new PDFWriter();

            _header = user+" Statement \n \n";
            _Message =  "Ordered Products: \n";
            int n = 0;
            try {
                if(totalPrice!= 0) {
                    while (n < productNames.size()) {
                        _Message += "- R" + productPrices.get(n) + "\t \t \t" + productNames.get(n) + "\n";
                        n++;
                    }
                    _Message += "\n" + "Total Paid:\b R" + String.valueOf(totalPrice);
                }else {
                    throw new Exception();
                }
            }catch (Exception e){
                _Message = "Item names or prices are null";
            }

            pdfWriter.doWrite(_header, _Message,user+"_statement");
            this.userID = user;
    }

    @Override
    public String getStatement() throws IOException {
        return pdfWriter.doRead(userID+"_statement");
    }
}
