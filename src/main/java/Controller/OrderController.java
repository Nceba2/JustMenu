package Controller;

import Model.CartModel;
import Model.ICartModel;
import Model.IProductModel;
import Model.ProductModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;


@WebServlet("/OrderController")
public class OrderController extends HttpServlet {
/**
* the class is for retrieving information from GUI menu
* then process order to storage Json file
* main focus here is post method and session storage
* */

    private ICartModel icartModel= new CartModel();
    private Map m;
    private String file2;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        file2 = "src/main/webapp/Lib/data/products.json";

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
        request.setAttribute("user", request.getParameter("user"));//user ordering items

        System.out.println("\n Cart filled: \n"+icartModel.getCart());
        System.out.println("\n prices: \n"+icartModel.getCartPrices());
        System.out.println("\n total: \n"+icartModel.getTotalPrice());

        /** The following line can be used to call a .JSP file to provide the view **/
        request.getRequestDispatcher("/views/Cart.jsp?Testx=test1").forward(request, response);
    }
}
