<html>
<body>
<%@ page import="java.sql.*" %>  
<%@ page import="java.io.*" %>  
<%! String n=""; %> 
<%
		response.setContentType("text/html");
		n=request.getParameter("uname");
		//out.print("hello");
		boolean flag=false;
		Class.forName("com.mysql.jdbc.Driver"); //Or any other driver
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/records","root","manav");
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from StudentRecords;");
		try{while(rs.next()) 
			{	if((rs.getString(1)).equalsIgnoreCase(n))
				{	out.print("<h3>Records found<h3> <br> Name :-- "+n+" Id :"+rs.getString(2));
					flag=true;
				}
			}
		}catch(SQLException e) {}
		if (!flag)
			out.print("<h3>No Records Found</h3>");
		System.out.println("Done");
		conn.close();
%>
</body>
</html>