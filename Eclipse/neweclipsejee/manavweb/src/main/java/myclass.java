

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class myclass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
				response.setContentType("text/html");;
				PrintWriter out=response.getWriter();
				int n=Integer.parseInt(request.getParameter("input"));
				out.print("<html><body>Table of "+n+" is :-<br>");
				for(int i=1;i<=10;i++) {
					out.print(n+" x "+i+" = "+(n*i));
					out.print("<br>");
				}out.print("</body></html>");
				out.close();
			}catch(Exception e) {}
		}

}
