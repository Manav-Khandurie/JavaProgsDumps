package manav;
import java.sql.*;
public class Q3jdbc {
   public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver"); //Or any other driver
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","manav");
		Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=stmt.executeQuery("select * from meeting;");
		System.out.println("Names of participants in meeting 1144 are :--");
		try{while(rs.next()) 
			{	if(Integer.parseInt(rs.getString(2))==1114)
				System.out.print(rs.getString(1)+" , ");
			}
		}catch(SQLException e) {}
		rs.first();
		System.out.println("\n");
		System.out.println("The new id generated w.r.t the participants are :--");
		PreparedStatement pstmt=conn.prepareStatement("update meeting set Id=? where NameOfParticipant=?;");
		do {	
			String newid="";
			do {
				newid+=(int)((Math.random()*(5-0))+0);//concats random 5 numbers together b/w 0 and 5
			}
			while(newid.length()<5);
			pstmt.setString(2,rs.getString(1));pstmt.setString(1,newid);
			pstmt.executeUpdate();
		}while(rs.next());
		rs.first();
		do {	
			System.out.println(rs.getString(1).trim()+" : "+rs.getString(4).trim());
		}
		while(rs.next());
		System.out.println();
		System.out.println("Participants attending Tuesday meetings :--");
		rs.first();
		do {	
			if(rs.getString(3).equalsIgnoreCase("tues"))
					System.out.print(rs.getString(1)+" , ");
		}while(rs.next());
		System.out.println("\n");
		System.out.println("The meeting name and the number of participants in it are :--");
		int arr[]= {0,0};
		rs.first();
		do {	
			if(rs.getString(2).equalsIgnoreCase("1114"))
				arr[1]++;
			else
				arr[0]++;
		}while(rs.next());
		System.out.println("1113 :\t"+arr[0]);
		System.out.println("1114 :\t"+arr[1]);
		conn.close();
		
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
