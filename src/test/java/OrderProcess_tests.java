import Model.CartModel;
import Model.DataModel;
import Model.ICartModel;
import Model.JsonFileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;

public class OrderProcess_tests {
    //use arrays global to display and process
    //add items to order[] using array --set & get methods
    private URL url;
    private HttpURLConnection con;

    @Before
    public void initialValues() throws MalformedURLException {
        url = new URL("http://localhost:8080/justmenu/");
    }

     @Mock
     HttpServletRequest request;

     @Test
     public void Order_test() throws IOException {
         JSONObject testJsonArray = new JSONObject(){};
         testJsonArray.put("test","test");

         request = Mockito.mock(HttpServletRequest.class);
         request.setAttribute("test","test");

         //test map
         Map m = request.getParameterMap();

         //and add to cart
         ICartModel cartModel = new CartModel();
         cartModel.addToCart(m,request);

         //assert cart temp storage is not null
         assertEquals(testJsonArray,cartModel.getCart());
     }

}
