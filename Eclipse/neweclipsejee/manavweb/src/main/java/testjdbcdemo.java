import java.io.PrintWriter;
import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import jakarta.servlet.http.HttpServletResponse;

public class testjdbcdemo {
	public void insert(String n,String p,String e,String c, HttpServletResponse response,PrintWriter out)throws ClassNotFoundException 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","manav");
			PreparedStatement ps=conn.prepareStatement( "insert into registration values(?,?,?,?)");  
			ps.setString(1,n);  
			ps.setString(2,p);  
			ps.setString(3,e);  
			ps.setString(4,c);  
			int i=ps.executeUpdate();  
			if(i>0)  
			out.print("You are successfully registered..."); 
			conn.close();
		}
		//catch(ClassNotFoundException ex){System.out.println(ex);ex.printStackTrace();}
		catch(SQLException ex)
		{
			System.out.println(ex);
			ex.printStackTrace();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			ex.printStackTrace();
		}
		finally {
			System.out.println("Done");
		}
	}/**
	public static void main(String args[])
	{
		testjdbcdemo tjd=new testjdbcdemo();
		tjd.insert(n,p,3,c);
	}**/
}
