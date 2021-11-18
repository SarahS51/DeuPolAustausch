<%@ page import=user.* %>
<%@ page imort=connection.* %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<jsp:useBean id="userInfo" class="user.UserInformation" scope="session"/>
<!DOCTYPE html>

<%
if(request.getParameter("login") != null) {
	User user = new User();
	if(request.getParameter("loginName") != null && request.getParameter("loginPassword") != null) {
		user.seteMail(request.getParameter("loginName"));
		user.setPassword(request.getParameter("loginPassword"));
	}
}
%>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Login</title>
	<link href="css/styleLogin.css" rel="stylesheet" type="text/css">
    <tag:header/>
</head>
<body>
	<div class="wrapper fadeInDown">
	  <div id="formContent">
	    <!-- Tabs Titles -->
	
	    <!-- Icon -->
	    <div class="fadeIn first">
	    	<a href="index.jsp">
	      		<tag:logoGSO></tag:logoGSO>
	      	</a>
	    </div>
	
	    <!-- Login Form -->
	    <form>
	      <input type="text" id="login" class="fadeIn second" name="loginName" placeholder="Benutzername">
	      <input type="password" id="password" class="fadeIn third" name="loginPassword" placeholder="Passwort">
	      <input type="submit" name="login" class="fadeIn fourth" value="Anmelden">
	    </form>
	
	    <!-- Remind Passowrd -->
	    <div id="formFooter">
	      <a class="underlineHover" href="registrierung.jsp">Registrieren</a>
	    </div>
	
	  </div>
	</div>
    <tag:scripts/>
</body>
</html>