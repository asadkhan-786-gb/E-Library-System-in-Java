package servlets;
//Importing libs
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@WebServlet("/servlets.LogoutAdmin")
//Logout method for admin
public class LogoutAdmin extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().invalidate();
        response.sendRedirect("index.html");
    }
}
    

        
 

   
