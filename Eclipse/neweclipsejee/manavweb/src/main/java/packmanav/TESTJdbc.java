package packmanav;
import java.sql.*;
public class TESTJdbc {
	public static void main(String[] args) 
	{
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver"); //Or any other driver
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","manav");Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from registration;");
			try{while(rs.next()) 
				{	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				}
			}catch(SQLException e) {}
			/** Using prepared statement to add a record
			PreparedStatement stm=conn.prepareStatement("insert into Employ values(?,?,?);");
			stm.setInt(1,5);stm.setString(2,"Ronit");;stm.setString(3,"50000");
			stm.executeUpdate();
			**/
			System.out.println("Done");
			conn.close();
		}
		/**catch(ClassNotFoundException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}**/
		catch(SQLException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("Done");
		}
		}
	}