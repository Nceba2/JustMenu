package Controller;

import Model.IProductModel;
import Model.ProductModel;
import org.json.simple.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/justmenu")
public class JustMenuController extends HttpServlet {
    private JSONArray _kotas, _drinks, _others;
    private String file2;
    private String pager;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        file2 = "src/main/webapp/Lib/data/products.json";

        IProductModel productModel = new ProductModel();
        productModel.setProductSet(file2);

        _kotas = productModel.getProductSet("kota");
        _drinks = productModel.getProductSet("drinks");
        _others = productModel.getProductSet("others");

        request.setAttribute("Kotas", _kotas);
        request.setAttribute("Drinks", _drinks);
        request.setAttribute("Others", _others);

        if (request.getParameter("pager") != null)
            pager = request.getParameter("pager");
        else
            pager = "index";

        /** The following line can be used to call a .JSP file to provide the view **/
        request.getRequestDispatcher("/views/" + pager + ".jsp").forward(request, response);
    }
}