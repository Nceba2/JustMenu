import Model.DataModel;
import Model.JsonFileReader;
import org.json.simple.JSONArray;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JustMenuControllerTests {

    private URL url;
    private String file,file2;
    private JsonFileReader Reader;
    private DataModel dataModel;
    private HttpURLConnection con;
    private JSONArray products;

    @Before
    public void initialValues() throws MalformedURLException {
        url = new URL("http://localhost:8080/justmenu/");
        file = "src/main/webapp/Lib/data/data.json";
        file2 = "src/main/webapp/Lib/data/products.json";
    }

    @Test
    public void testDoGetResponseCode() throws IOException {
        con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        assertEquals(200,con.getResponseCode());
    }
    @Test
    public void testDoGetResponseCodeURL_NoExtendedParameters() throws IOException {
        URL url = new URL("http://localhost:8080/");
        con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        assertNotEquals(200,con.getResponseCode());
    }
    //add order[prices] to total[] incrementing while loop --set & get methods
    //use order[] and total[] to display bill
}
