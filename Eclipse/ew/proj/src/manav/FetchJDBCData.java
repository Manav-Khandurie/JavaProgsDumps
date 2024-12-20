package manav;
import java.sql.*;
public class FetchJDBCData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Or any other driver
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "manav");
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  
                    ResultSet.CONCUR_UPDATABLE);
			// stmt.executeUpdate("insert into Employ values(4,\"Mohit\",\"40000\");");
			//stmt.executeUpdate("delete from Employ where name=\"Rohit\"");//can delete multiple values
			// display
			/*
			PreparedStatement stm=conn.prepareStatement("update Employ set name=(?) where id=(?);");
			stm.setInt(2,5);
			stm.setString(1,"Rohit");
			stm.executeUpdate();
			*/
			//boolean ans=false;
			ResultSet rs = stmt.executeQuery("select * from Employ;");
			ResultSetMetaData rsmd=rs.getMetaData();  
			rs.first();
			System.out.println("Total columns: "+rsmd.getColumnCount());  
			System.out.println("Column  Name of 1st column: "+rsmd.getTableName(3));  
			System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
			System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));
			try {
				do {
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
				}while(rs.next());
			} catch (SQLException e) {
			}
			int c=rs.getRow();
			System.out.println(c);
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		} finally {
			System.out.println("Done");
		}
	}
}