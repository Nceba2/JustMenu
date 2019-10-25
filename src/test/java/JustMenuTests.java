import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JustMenuTests {

    private URL url;
    private String file,file2;
    private JsonFileReader Reader;
    private ProductDataFilter productDataFilter;
    private HttpURLConnection con;

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

    //read from json product file and convert to java arrays
    @Test
    public void FileReader_Test() throws IOException, ParseException {
        Reader = new JsonFileReader();
        assertEquals("ok",Reader.doRead(file).get("test"));
    }
    @Test
    public void FileReader_Product_Test() throws IOException, ParseException {
        Reader = new JsonFileReader();
        JSONObject products = (JSONObject) Reader.doRead(file2).get("products");
        JSONArray product = (JSONArray) products.get("testproducts");
        JSONObject Kota = (JSONObject) product.get(0);//0 is index moving around each product
        int price = Integer.valueOf(Kota.get("price").toString());

        System.out.println("R"+price);
        assertEquals(200,price);
    }
    @Test
    public void FileReader_ProductSet_Test() throws IOException, ParseException {
        Reader = new JsonFileReader();
        productDataFilter = new ProductDataFilter(file2);
        productDataFilter.setProductSet("testproducts");

        assertEquals("[{\"price\":200,\"name\":\"test item\",\"description\":\"test description\"}]",productDataFilter.getProductSet().toString());
    }
    @Test
    public void FileReader_Null_ProductSet_Test() throws IOException, ParseException {
        Reader = new JsonFileReader();
        productDataFilter = new ProductDataFilter(file2);
        productDataFilter.setProductSet(null);

        assertEquals(null,productDataFilter.getProductSet());
    }
    @Test
    public void FileReader_FalseValue_ProductSet_Test() throws IOException, ParseException {
        Reader = new JsonFileReader();
        productDataFilter = new ProductDataFilter(file2);
        productDataFilter.setProductSet("FalseValue");

        assertEquals(null,productDataFilter.getProductSet());
    }
    //use arrays global to display and process
    //add items to order[] using array --set & get methods
    //add order[prices] to total[] incrementing while loop --set & get methods
    //use order[] and total[] to display bill
}
