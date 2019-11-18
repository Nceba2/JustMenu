package Model;

import org.json.simple.JSONArray;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface ICartModel {

    void addToCart(Map m,  HttpServletRequest request);

    void SubtractFromCart(int id);

    JSONArray getCart();

    JSONArray getCartPrices();

    int getTotalPrice();

    String getUser();
}
