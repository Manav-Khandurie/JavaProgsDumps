package manav;
import java.sql.*;
public class JDBCEndSem {

	public static void main(String args[]) {
		
		int salary[]=new int[100];
		String name[]=new String[100];
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","manav");
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employee;");
			int k=0;
			while(rs.next()) {
				
				salary[k]=rs.getInt(3);
				name[k]=rs.getString(2);
				k++;
			}
			PreparedStatement pstmt=conn.prepareStatement("update employee set Salary=? where ename=?");
			for(int i=0;i<k;i++) {
				int x=salary[i]+(int)(salary[i]*0.1);
				pstmt.setInt(1, x);
				pstmt.setString(2, name[i].trim());
				pstmt.executeUpdate();
			}
			System.out.println("Done with execution check in mysql");
			conn.close();
			}catch(Exception e) {e.printStackTrace();}
	}

}
