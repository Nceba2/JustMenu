import Model.ISessionServices;
import Model.SessionService;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Before;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;

public class SessionServices_tests {
    private JSONArray productNames;
    private JSONArray productPrices;
    private int TotalPrice;
    private String user;
    private HttpServletRequest request;

    @Before
    public void initialValues() throws ParseException {
        JSONParser parser= new JSONParser();
        this.productNames =(JSONArray) parser.parse("[\"Regular Kota\",\"Regular part2 Kota\"]");
        this.productPrices =(JSONArray) parser.parse("[\"10\",\"20\"]");
        this.TotalPrice = 30;
        this.user = "Paul";
    }

    @Test
    public void getFromSession_ProductNames_test(){
        ISessionServices sessionServices = new SessionService();
        //sessionServices.setSessionCart(Mockito.mock(request.getSession()));
    }
}
