import Model.IProductModel;
import Model.ProductModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ProductModel_tests {

    private URL url;
    private String file,file2;
    private JSONArray products;

    @Before
    public void initialValues() throws MalformedURLException {
        url = new URL("http://localhost:8080/justmenu/");
        file = "src/main/webapp/Lib/data/data.json";
        file2 = "src/main/webapp/Lib/data/products.json";
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


    @Test
    public void ProductModel_getname_test()
    {
        /**
         * testing for a product to be added to a session attribute
         * the session attribute is the client's cart
         * the test is for retrieving name from selected product
         */
        IProductModel productModel = new ProductModel();
        productModel.setProductSet(file2);
        String proName = productModel.getProduct("name","k",0);//choose a product set example pizzas or kota's

        System.out.println(proName);
        assertNotNull(proName);
    }

    @Test
    public void ProductModel_getPrice_test()
    {
        /**
         * testing for a product to be added to a session attribute
         * the session attribute is the client's cart
         * the test is for retrieving price from selected product
         */
        IProductModel productModel = new ProductModel();
        productModel.setProductSet(file2);
        String proName = productModel.getProduct("price","k",0);//a product is set to be added to a cart

        System.out.println(proName);
        assertNotNull(proName);
    }

}
