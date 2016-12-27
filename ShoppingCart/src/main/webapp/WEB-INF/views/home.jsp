<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>shopping cart</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<span class="glyphicon glyphicon-user"></span>


<a href="login">login</a><br>
<a href="register">register</a>
<hr>

${successmsg }
<c:if test="${showLoginPage}">
<jsp:include page="login.jsp"></jsp:include>
</c:if>

<c:if test="${not empty errormsg}">
${errormsg}
<jsp:include page="login.jsp"></jsp:include>
</c:if>

<c:if test="${showRegistrationPage}">
 <jsp:include page="registration.jsp"></jsp:include>
  </c:if> 

</body>
</html>