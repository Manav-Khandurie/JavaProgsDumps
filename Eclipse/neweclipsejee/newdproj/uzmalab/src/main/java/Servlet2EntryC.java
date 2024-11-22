

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class Servlet2EntryC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
				Cookie ck[]=request.getCookies();
				response.setContentType("text/html");
				PrintWriter out=response.getWriter();
				HttpSession session=request.getSession(false);
				//if no session is created does nothings else returns associated session
				out.print("<html><body><h2>Using HttpSession</h2><br><h3> Hello ");
				out.print((String)session.getAttribute("uname"));
				//returns null if the parameter isnt present
				out.print("!</h3></body></html>");
				out.close();
			}catch(Exception e) {e.getMessage();
		}
	}
}
