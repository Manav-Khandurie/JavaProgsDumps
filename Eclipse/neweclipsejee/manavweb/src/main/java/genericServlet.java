

import jakarta.servlet.*;
import java.io.*;
public class genericServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<HTML><body>Welcome here[Generic Servlet Class]</body></HTML>");
		out.close();
	}
       
   

}
