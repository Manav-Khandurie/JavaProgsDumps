package manav;
import java.sql.*;
import java.util.*;
public class jdbctest {
	static Scanner sc=new Scanner(System.in);
	static boolean choice()
	{
		System.out.println("Press 1 to enter values, 0 to stop");
		int choice=sc.nextInt();
		if(choice==1)
		return true;
		else return false;
	}
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //Or any other driver
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","manav");
			Statement stmt=conn.createStatement();
			int n=stmt.executeUpdate("create table Employ(Name varchar(25), ID Integer, Salary long);");
			System.out.println("Table created , value returned = "+ n);
			PreparedStatement pstmt=conn.prepareStatement("Insert into employ values(?,?,?);");
			while(choice()) {
				System.out.println("Enter name , id and salary");
				sc.nextLine();//clears buffer
				String name=sc.nextLine();
				int id=sc.nextInt();
				long salary=sc.nextLong();
				pstmt.setString(1,name);pstmt.setInt(2,id);pstmt.setLong(3,salary);
				pstmt.executeUpdate();
			}
			System.out.println("Table created is:-");
			ResultSet rs=stmt.executeQuery("select * from Employ;");
			try{while(rs.next()) 
				{	System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getLong(3));
				}
			}catch(SQLException e) {}
			conn.close();
			sc.close();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
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
	}//main
}//class