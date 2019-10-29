package Model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public interface ICartModel {
    void addToCart(JSONObject product);
    JSONArray getProduct();
}
