<html>
<body>
<%@ page errorPage="/myerror.jsp" %>
<%
String name=request.getParameter("uname");  
String pass=request.getParameter("pass");

%>
<%= "Welcome "+name+" , Your sap is :"+pass+"!!" 

%>
</body>
</html>