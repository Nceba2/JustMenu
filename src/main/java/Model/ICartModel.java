package Model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface ICartModel {

    void addToCart(Map m,  HttpServletRequest request);
    JSONArray getCart();
    JSONArray getCartPrices();
    int getTotalPrice();
}
