<html>
<head>
<body>
<%@ page import="java.sql.*" %>
<%! Connection conn=null; %>
<%= "Table content" %>
<% Class.forName("com.mysql.cj.jdbc.Driver");
	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","manav");
	PreparedStatement pstmt=conn.prepareStatement("Select * from employ;");
	ResultSet rs=pstmt.executeQuery();
	while(rs.next())
		out.print(rs.getString(2)+" "+rs.getInt(3));
%>
</body>
</html>