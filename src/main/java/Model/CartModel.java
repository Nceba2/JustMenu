package Model;

import org.json.simple.JSONArray;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CartModel implements ICartModel {
    private JSONArray cartArray,cartKeys;
    private HttpSession session;
    private int totalPrice = 0;
    private String file2 = "src/main/webapp/Lib/data/products.json";

    public void addToCart(Map m, HttpServletRequest request){

        IProductModel productModel = new ProductModel();
        productModel.setProductSet(file2);

        try {
            Set s = m.entrySet();
            Iterator it = s.iterator();
            cartArray = new JSONArray() {};
            cartKeys = new JSONArray() {};

            while (it.hasNext()) {
                Map.Entry<String, String[]> entry = (Map.Entry<String, String[]>) it.next();

                String key = entry.getKey();
                String[] value = entry.getValue();

                if(!key.equals("user"))
                    this.cartArray.add(productModel.getProduct("name",String.valueOf(key.charAt(0)),Integer.parseInt(value[0])));

                if(!key.equals("user"))
                    this.cartKeys.add(productModel.getProduct("price",String.valueOf(key.charAt(0)),Integer.parseInt(value[0])));

                if(!key.equals("user"))
                    totalPrice = totalPrice + Integer.parseInt(productModel.getProduct("price",String.valueOf(key.charAt(0)),Integer.parseInt(value[0])));
            }
            session = request.getSession();
            session.setAttribute("cartSessionArray", cartArray);
            session.setAttribute("cartSessionArrayPrices", cartKeys);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public JSONArray getCart(){
        return (JSONArray) session.getAttribute("cartSessionArray");
    }

    public JSONArray getCartPrices(){
        return (JSONArray) session.getAttribute("cartSessionArrayPrices");
    }

    public int getTotalPrice(){
        return totalPrice;
    }

}
