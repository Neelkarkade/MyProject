<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
    <h2>Add Registration</h2>
    <form action="saveReg" method="post">
        <pre>
           Name <input type="text" name="name"/>
	       Email <input type="text" name="emailId"/>
	       Mobile <input type="text" name="mobile"/>
	       <input type="submit" value="add"/>
        </pre>        
    </form>
    ${msg} 
</body>
</html>