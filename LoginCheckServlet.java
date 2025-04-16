import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginCheckServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        // Dummy credentials for demonstration
        if ("user1".equals(user) && "pass123".equals(pass)) {
            out.println("<h2>Welcome, " + user + "!</h2>");
        } else {
            out.println("<h2>Invalid username or password.</h2>");
        }

        out.close();
    }
}
