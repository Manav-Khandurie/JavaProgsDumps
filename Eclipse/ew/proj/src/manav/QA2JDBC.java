package manav;
import java.sql.*;
import java.util.*;
public class QA2JDBC {
   public static void main(String[] args) {
	try {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver"); //Or any other driver
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","manav");
		Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=stmt.executeQuery("select * from meeting;");
		ResultSetMetaData rsmd=rs.getMetaData();
		
		System.out.println("The coloumn names are as follows :-- ");
		try {
			for (int j=1;j<rsmd.getColumnCount();j++)
			System.out.print(rsmd.getColumnName(j)+" , "); 
		}catch(SQLException e) {}
		
		System.out.println();
		System.out.println("\nNames of participants in meeting 1144 are :--");
		int i=0;
		try{
			while(rs.next()) 
			{	if(Integer.parseInt(rs.getString(2))==1114)
				{
					System.out.print(rs.getString(1)+" , ");i++;
				}
			}
		}catch(SQLException e) {}
		System.out.println("\n \nTotal number of participants in meeting 1144 are :--"+i);
		System.out.println();
		
		rs.first();
		PreparedStatement pstmt=conn.prepareStatement("insert into meeting values(?,?,?,?,?,?)");
		System.out.println("Enter Y/y to insert names into table");
		char choice=sc.nextLine().charAt(0);
		do {
			System.out.println("Enter name,meetingid,time,mobile,email");
			String name=sc.nextLine();
			String meetingid=sc.nextLine();
			String time=sc.nextLine();
			String mobile=sc.nextLine();
			String email=sc.nextLine();
			String id="";
			do {
				id+=(int)((Math.random()*(5-0))+0);//concats random 5 numbers together b/w 0 and 5
			}
			while(id.length()<5);
			System.out.println("The new id generated for the participants is :-- \t "+id);
			pstmt.setString(1,name);pstmt.setString(2,meetingid);pstmt.setString(3,time);pstmt.setString(4,id);pstmt.setString(5,mobile);pstmt.setString(6,email);
			pstmt.executeUpdate();
			System.out.println("Enter Y/y to insert names into table");
			choice=sc.nextLine().charAt(0);
			
		}while(choice=='y'||choice=='Y');
		
		conn.close();
		sc.close();
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}finally {
		System.out.println("Done");
	}
	}//main
}//class