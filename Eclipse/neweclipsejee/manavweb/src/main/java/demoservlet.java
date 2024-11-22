
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
public class demoservlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = -2399671137476004288L;
	ServletConfig config=null;
	public void init(ServletConfig config)throws ServletException{
		this.config=config;
	}
	public void service (ServletRequest request,ServletResponse response)throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<HTML><body>Welcome here[Inteface Servlet]</body></HTML>");
		out.close();
	}
	public void destroy()
	{
		System.out.println("The servlet is destroyed");
	}
	public ServletConfig getServletConfig()
	{
		return (ServletConfig)config;
	}
	public String getServletInfo()
	{
		return "" ;
	}
}

