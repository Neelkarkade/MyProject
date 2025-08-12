<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inquiry</title>
</head>
<body>
    <h2>Add Student details</h2>
    <form action="addInquiry" method="post">
      <pre>
          Name: <input type="text" name="name"/>
          Email: <input type="text" name="email"/>
          Mobile: <input type="text" name="mobile"/>
          <input type="submit" value="add"/>
      </pre>
    </form>
    <p>
	   <%
	    if(request.getAttribute("Message")!=null){
		   out.println(request.getAttribute("Message"));
	    }
	   %>
    </p>
</body>
</html>