
import org.json.simple.parser.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/justmenu")
public class JustMenu extends HttpServlet {
    private String _kotas,_drinks,_others;//to be refactored as json arrays
    private String file2;
    IProductDataFilter productDataFilter;
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws  ServletException, IOException {

        file2 = "src/main/webapp/Lib/data/products.json";
        try {
            productDataFilter = new ProductDataFilter(file2);

            productDataFilter.setProductSet("kota");
            _kotas = productDataFilter.getProductSet().toString();
            productDataFilter.setProductSet("drinks");
            _drinks = productDataFilter.getProductSet().toString();
            productDataFilter.setProductSet("others");
            _others = productDataFilter.getProductSet().toString();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        request.setAttribute("Kotas",_kotas);
        request.setAttribute("Drinks",_drinks);
        request.setAttribute("Others",_others);

        /** The following line can be used to call a .JSP file to provide the view **/
        request.getRequestDispatcher("/views/index.jsp").forward(request, response);
    }
}
