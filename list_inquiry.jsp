<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Inquiry</title>
</head>
<body>
     <h2>Inquiries</h2>
     <table>
	     <tr>
		     <th>
		       Name
		     </th>
		     <th>
		       Email
		     </th>
		     <th>
		       Mobile
		     </th>
		     <th>
		       Delete
		     </th>
	     </tr>
	     <%
	       ResultSet result = (ResultSet)request.getAttribute("result");
	       while(result.next()){ %>
	       <tr>
		     <td>
		       <%=result.getString(1) %>
		     </td>
		     <td>
		       <%=result.getString(2) %>
		     </td>
		     <td>
		       <%=result.getString(3) %>
		     </td>
		     <td>
		       <a href="deleteInquiry?emailId=<%=result.getString(2)%>">delete</a>
		     </td>
	     </tr>
	     
	    <%}%>
	
     </table>
</body>
</html>