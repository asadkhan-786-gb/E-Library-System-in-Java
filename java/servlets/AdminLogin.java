package servlets;
//Importing libs
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@WebServlet("/servlets.AdminLogin")
public class AdminLogin extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>Admin Section</title>");
		out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
                //Default password & email
                String e1 = "admin@unv.com";
                String p1 ="admin123";
		if(email.equals(e1)&&password.equals(p1)){
			HttpSession session=request.getSession();
			session.setAttribute("admin","true");
			
			request.getRequestDispatcher("navadmin.html").include(request, response);
			request.getRequestDispatcher("admincarousel.html").include(request, response);
			
		}else{
			request.getRequestDispatcher("navhome.html").include(request, response);
			out.println("<div class='container'>");
			out.println("<h3>Username or password error</h3>");
			request.getRequestDispatcher("adminloginform.html").include(request, response);
			out.println("</div>");
		}
		
		
		request.getRequestDispatcher("footer.html").include(request, response);
		out.close();
	}

}
