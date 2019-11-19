package Controller;

import Model.*;
import com.itextpdf.text.DocumentException;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;


@WebServlet("/OrderController")
public class OrderController extends HttpServlet {
/**
* the class is for retrieving information from GUI menu
* then process order to storage Json file
* main focus here is post method and session storage
* */

    private ICartModel icartModel= new CartModel();
    private IStatementGenerator statementGenerator;
    private Map m;
    private String file2,pager;
    private JSONArray orderNames;
    private JSONArray orderPrices;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        file2 = "src/main/webapp/Lib/data/products.json";
        pager ="/views/Cart.jsp";

        IProductModel productModel = new ProductModel();
        productModel.setProductSet(file2);

        /**
        * this method is to process and order...
        * from Cart to Json storage
        * */
        System.out.println("doing post..");

        m = request.getParameterMap();
        icartModel.addToCart(m,request);

        request.setAttribute("cartArray", icartModel.getCart());//product names ordered
        request.setAttribute("cartArrayPrices", icartModel.getCartPrices());//product prices ordered
        request.setAttribute("cartArrayTotalPrice", icartModel.getTotalPrice());//calculate total
        request.setAttribute("user", icartModel.getUser());//user ordering items

        System.out.println("\n Cart filled: \n"+icartModel.getCart());
        System.out.println("\n prices: \n"+icartModel.getCartPrices());
        System.out.println("\n total: \n"+icartModel.getTotalPrice());

        //the following would then be extended to complete the payment on ipay on any other payment platforms
        //the statement is if order items are ready when user click pay now button
        //then process payment and return a statement to the user which they can keep
        if(request.getParameter("OrderItemsNames") !=null && request.getParameter("OrderItemsPrices") !=null){

            try {
                JSONParser parser = new JSONParser();
                orderNames = (JSONArray) parser.parse(request.getParameter("OrderItemsNames"));
                orderPrices = (JSONArray) parser.parse(request.getParameter("OrderItemsPrices"));
                int totalPrice = Integer.parseInt(request.getParameter("OrderItemsTotal"));
                String user = icartModel.getUser();
                statementGenerator = new StatementGenerator();

                pager = "/Lib/data/PDFs/" + user + "_statement.pdf";
                try {
                    statementGenerator.setStatement(orderNames, orderPrices, totalPrice, user);
                } catch (DocumentException e) {
                    e.printStackTrace();
                }
                request.getRequestDispatcher(pager).forward(request, response);
            }catch (ParseException f){
                f.printStackTrace();
            }
            System.out.println("paid for: " + request.getParameter("OrderItemsNames")+"\n"+"Generating Statemet for user...");
        }else {
            System.out.println("failed to generate statement");

            /** The following line can be used to call a .JSP file to provide the view **/
            request.getRequestDispatcher(pager).forward(request, response);
        }
    }
}
