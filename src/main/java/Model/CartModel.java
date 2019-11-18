package Model;

import org.json.simple.JSONArray;

import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CartModel implements ICartModel {
    private JSONArray cartArray,cartKeys;
    private int totalPrice = 0;
    private String file2 = "src/main/webapp/Lib/data/products.json", user;
    private ISessionServices sessionService = new SessionService();

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

                if(key.equals("user"))
                    user = String.valueOf(value[0]);
            }
            sessionService.setSessionCart(request, cartArray, cartKeys, totalPrice, user);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void SubtractFromCart(int id){
        cartArray = sessionService.getSessionProductNames();
        cartKeys = sessionService.getSessionProductPrices();

        //session.setAttribute("cartSessionArrayTotalPrice",null);
        //get item by name or id
        //using cartKeys.remove(id); to remove the item from cart
        cartKeys.remove(id);
        cartArray.remove(id);
    }
    public JSONArray getCart(){
        return sessionService.getSessionProductNames();
    }

    public JSONArray getCartPrices(){
        return sessionService.getSessionProductPrices();
    }

    public int getTotalPrice(){
        totalPrice = 0;
        return sessionService.getSessionTotalPrice();
    }

    public String getUser(){
        totalPrice = 0;
        return sessionService.getSessionUser();
    }

}
