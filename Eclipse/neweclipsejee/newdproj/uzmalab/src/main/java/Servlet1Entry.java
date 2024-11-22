
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class Servlet1Entry extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		
		try {
			response.setContentType("text/html");
			String uname=request.getParameter("uname");
			HttpSession session=request.getSession();
			//creates a session if one isnt already associated with the req
			session.setAttribute("uname",uname);
			PrintWriter out=response.getWriter();
			out.print("<html><body><form action=\"Servlet2EntryC\" method=\"post\"> <h3> Welcome "+uname+"!! </h3><br><input type=\"submit\" value=\"go\"></form></body></html>");
			out.close();
		}catch(Exception e) {e.getMessage();}
	}

}
