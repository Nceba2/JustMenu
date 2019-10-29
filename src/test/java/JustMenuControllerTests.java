import Model.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

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

    //the following tests are ProductModel test for true value, null value and false value
    @Test
    public void ProductModel_test()
    {
        IProductModel productModel = new ProductModel();
        productModel.setProductSet(file2);
        products = productModel.getProductSet("testproducts");//choose a product set example pizzas or kota's

        assertNotNull(products);
    }
    @Test
    public void ProductModel_NullFile_test()
    {
        IProductModel productModel = new ProductModel();
        productModel.setProductSet(null);
        products = productModel.getProductSet("testproducts");//choose a product set example pizzas or kota's

        assertEquals(null, products);
    }
    @Test
    public void ProductModel_FalseFile__test()
    {
        IProductModel productModel = new ProductModel();
        productModel.setProductSet(file);
        products = productModel.getProductSet("testproducts");//choose a product set example pizzas or kota's

        assertEquals(null, products);
    }
    @Test
    public void ProductModel_NullProductSet__test()
    {
        IProductModel productModel = new ProductModel();
        productModel.setProductSet(file);
        products = productModel.getProductSet(null);//choose a product set example pizzas or kota's

        assertEquals(null, products);
    }
    @Test
    public void ProductModel_NullFile_and_NullProductSet__test()
    {
        IProductModel productModel = new ProductModel();
        productModel.setProductSet(null);
        products = productModel.getProductSet(null);//choose a product set example pizzas or kota's

        assertEquals(null, products);
    }
    @Test
    public void ProductModel_Values_test()
    {
        IProductModel productModel = new ProductModel();
        productModel.setProductSet(file2);
        products = productModel.getProductSet("testproducts");//choose a product set example pizzas or kota's

        JSONObject Kota = (JSONObject) products.get(0);//0 is index moving around each product
        int price = Integer.valueOf(Kota.get("price").toString());//the existance of this value proves validity

        assertNotNull(products);
        assertEquals(200, price);
    }
    //following conditions will cause null pointer exceptions
    @Test(expected=NullPointerException.class)
    public void ProductModel_NullFile_Values_test()
    {
        IProductModel productModel = new ProductModel();
        productModel.setProductSet(null);
        products = productModel.getProductSet("testproducts");//choose a product set example pizzas or kota's

        JSONObject Kota = (JSONObject) products.get(0);//0 is index moving around each product... should return nullpointer exception
    }

    @Test(expected=NullPointerException.class)
    public void ProductModel_NullFile_and_NullProductSet_Values_test()
    {
        IProductModel productModel = new ProductModel();
        productModel.setProductSet(null);
        products = productModel.getProductSet(null);//choose a product set example pizzas or kota's

        JSONObject Kota = (JSONObject) products.get(0);//0 is index moving around each product... should return nullpointer exception
    }
    @Test(expected=NullPointerException.class)
    public void ProductModel_NullProductSet_Values_test()
    {
        IProductModel productModel = new ProductModel();
        productModel.setProductSet(file2);
        products = productModel.getProductSet(null);//choose a product set example pizzas or kota's

        JSONObject Kota = (JSONObject) products.get(0);//0 is index moving around each product... should return nullpointer exception
    }
    @Test(expected=NullPointerException.class)
    public void ProductModel_FalseFile_and_NullProductSet_Values_test()
    {
        IProductModel productModel = new ProductModel();
        productModel.setProductSet(file);
        products = productModel.getProductSet(null);//choose a product set example pizzas or kota's

        JSONObject Kota = (JSONObject) products.get(0);//0 is index moving around each product... should return nullpointer exception
    }
    //use arrays global to display and process
    //add items to order[] using array --set & get methods
    @Test
    public void Order_addToCart_test() throws ParseException {
        //get product list
        String data="[{\"price\":200,\"name\":\"test item\",\"description\":\"test description\"}]";
        JSONParser jsonParser = new JSONParser();
        JSONArray productsArray =  (JSONArray) jsonParser.parse(data);//choose a product set example pizzas or kota's

        //select an item from products
        JSONObject product = (JSONObject) productsArray.get(0);//0 is index moving around each product

        //and add to cart
        ICartModel cartModel = new CartModel();
        cartModel.addToCart(product);

        //assert cart temp storage is not null
        assertEquals(product,cartModel.getProduct().get(0));
    }
    @Test
    public void Order_addToCart_null_test(){
        //and add to cart
        ICartModel cartModel = new CartModel();
        cartModel.addToCart(null);

        //assert cart temp storage is not null
        assertEquals(null,cartModel.getProduct().get(0));
    }
    @Test
    public void Order_addToCart_FalseValue_test() throws ParseException {
        String data="[{\"price\":200,\"name\":\"test item\",\"description\":\"test description\"}]";
        String falseData="[{\"falseValue\":\"false\"}]";

        JSONParser jsonParser = new JSONParser();
        JSONArray falseArray =  (JSONArray) jsonParser.parse(falseData);
        JSONArray productsArray =  (JSONArray) jsonParser.parse(data);//choose a product set example pizzas or kota's

        //select an item from products
        JSONObject product = (JSONObject) productsArray.get(0);//0 is index moving around each product

        //and add to cart
        ICartModel cartModel = new CartModel();
        cartModel.addToCart((JSONObject) falseArray.get(0));

        //assert cart temp storage is not null
        assertNotEquals(product,cartModel.getProduct().get(0));
    }
    @Test
    public void Order_addToCart_EmptyJSONObject_test() throws ParseException {
        String data="[{\"price\":200,\"name\":\"test item\",\"description\":\"test description\"}]";
        String EmptyJsonData="[{}]";

        JSONParser jsonParser = new JSONParser();
        JSONArray EmptyJsonArray =  (JSONArray) jsonParser.parse(EmptyJsonData);
        JSONArray productsArray =  (JSONArray) jsonParser.parse(data);//choose a product set example pizzas or kota's

        //select an item from products
        JSONObject product = (JSONObject) productsArray.get(0);//0 is index moving around each product

        //and add to cart
        ICartModel cartModel = new CartModel();
        cartModel.addToCart((JSONObject) EmptyJsonArray.get(0));

        //assert cart temp storage is not null
        assertNotEquals(product,cartModel.getProduct().get(0));
    }
    @Test
    public void Order_addToCart_EmptyJSONObject_returnValue_test() throws ParseException {
        String EmptyJsonData="[{}]";//what goes in must come out same

        JSONParser jsonParser = new JSONParser();
        JSONArray EmptyJsonArray =  (JSONArray) jsonParser.parse(EmptyJsonData);

        //and add to cart
        ICartModel cartModel = new CartModel();
        cartModel.addToCart((JSONObject) EmptyJsonArray.get(0));

        //assert cart temp storage is not null
        assertEquals(EmptyJsonArray,cartModel.getProduct());
    }

    //add order[prices] to total[] incrementing while loop --set & get methods
    //use order[] and total[] to display bill
}
