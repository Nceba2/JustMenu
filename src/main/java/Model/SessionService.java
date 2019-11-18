package Model;

import org.json.simple.JSONArray;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionService implements ISessionServices{
    private HttpSession session;

    @Override
    public void setSessionCart(HttpServletRequest request, JSONArray cartArray, JSONArray cartKeys, int totalPrice, String user) {
        session = request.getSession();
        session.setAttribute("cartSessionArray", cartArray);
        session.setAttribute("cartSessionArrayPrices", cartKeys);
        session.setAttribute("cartSessionArrayTotalPrice", totalPrice);
        session.setAttribute("user",user);
    }

    @Override
    public JSONArray getSessionProductNames() {
        return (JSONArray) session.getAttribute("cartSessionArray");
    }

    @Override
    public JSONArray getSessionProductPrices() {
        return (JSONArray) session.getAttribute("cartSessionArrayPrices");
    }

    @Override
    public int getSessionTotalPrice() {
        return (int) session.getAttribute("cartSessionArrayTotalPrice");
    }

    @Override
    public String getSessionUser() {
        return (String) session.getAttribute("user");
    }
}
