import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request,response);
	}
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();  
		String n=request.getParameter("username");  
		String p=request.getParameter("userpass");  
		String e=request.getParameter("useremail");  
		String c=request.getParameter("usercountry");  
		System.out.println("\nUser-name:\t"+n+"\nUser-pass:\t"+p+"\nUser-email:\t"+e+"\nUser-Country:\t"+c);
		testjdbcdemo tjd=new testjdbcdemo();
		try {
			tjd.insert(n,p,e,c,response,out);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			
		}
		/**
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","manav");
			PreparedStatement ps=conn.prepareStatement( "insert into registration values(?,?,?,?)");  
			ps.setString(1,n);  
			ps.setString(2,p);  
			ps.setString(3,e);  
			ps.setString(4,c);  
			int i=ps.executeUpdate();  
			if(i>0)  
			out.print("You are successfully registered..."); 
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from Employ;");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			conn.close();
			}catch (ClassNotFoundException ex) {System.out.println(ex);ex.printStackTrace();}  
			catch (SQLException ex) {System.out.println(ex);ex.printStackTrace();} 
			catch (Exception ex) {System.out.println(ex);ex.printStackTrace();} 
			finally {
			out.close(); 
			System.out.println("Done");
			}**/
		}  
		   
	}

