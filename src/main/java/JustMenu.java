
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/justmenu")
public class JustMenu extends HttpServlet {
    private String input;

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws  ServletException, IOException {

        input = "Connecting";
        request.setAttribute("ResponseText",input);

        /** The following line can be used to call a .JSP file to provide the view **/
        request.getRequestDispatcher("/views/index.jsp").forward(request, response);
    }
}
