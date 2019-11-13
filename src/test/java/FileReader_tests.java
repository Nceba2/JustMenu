import Model.DataModel;
import Model.JsonFileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FileReader_tests {

    private String file,file2;
    private JsonFileReader Reader;
    private DataModel dataModel;
    @Before
    public void initialValues(){
        file = "src/main/webapp/Lib/data/data.json";
        file2 = "src/main/webapp/Lib/data/products.json";
    }

    //read from json product file and convert to java arrays
    @Test
    public void FileReader_Test() throws IOException, ParseException {
        Reader = new JsonFileReader();
        assertEquals("ok", Reader.doRead(file).get("test"));
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
        dataModel = new DataModel();
        dataModel.setDataSet(file2);

        assertNotNull(dataModel.getDataSet().toString());
    }
    @Test
    public void FileReader_Null_ProductSet_Test() throws IOException, ParseException {
        dataModel = new DataModel();
        dataModel.setDataSet(null);

        assertEquals(null, dataModel.getDataSet());
    }
    @Test
    public void FileReader_FalseValue_ProductSet_Test() throws IOException, ParseException {
        dataModel = new DataModel();
        dataModel.setDataSet(file);

        assertEquals(null, dataModel.getDataSet());
    }
}
