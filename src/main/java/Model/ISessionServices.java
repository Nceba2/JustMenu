package Model;

import org.json.simple.JSONArray;
import javax.servlet.http.HttpServletRequest;

public interface ISessionServices {

    void setSessionCart(HttpServletRequest request, JSONArray cartArray, JSONArray cartKeys, int totalPrice, String user);

    JSONArray getSessionProductNames();

    JSONArray getSessionProductPrices();

    int getSessionTotalPrice();

    String getSessionUser();
}
