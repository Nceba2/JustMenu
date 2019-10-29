package Model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CartModel implements ICartModel {
    private JSONArray cartArray;
    public void addToCart(JSONObject product){
        cartArray = new JSONArray(){};
        this.cartArray.add(product);
    }
    public JSONArray getProduct(){
        return cartArray;
    }
}
