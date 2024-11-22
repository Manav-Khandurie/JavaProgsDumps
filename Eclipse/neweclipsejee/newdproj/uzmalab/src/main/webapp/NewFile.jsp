<html>
<body>
<%@ page errorPage="/myerror.jsp" %>
<%
String name=request.getParameter("uname");  
String pass=request.getParameter("pass");
if(!pass.equals("jsp"))
{
	RequestDispatcher rd =request.getRequestDispatcher("myerror.jsp");
	rd.forward(request, response);
}
%>
<%= "Welcome "+name+" , login sucessful!!" 

%>
</body>
</html>