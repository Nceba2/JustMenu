import org.junit.Before;
import org.junit.Test;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JustMenuTests {

    private URL url;
    private HttpURLConnection con;

    @Before
    public void initialValues() throws MalformedURLException {
        url = new URL("http://localhost:8080/justmenu/");
    }

    @Test
    public void displaytest(){
        //remember to download invision, try uizrad
        //subscribe to Danny Mac 3D
        //assert(null,);
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
}
