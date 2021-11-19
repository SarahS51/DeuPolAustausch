<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
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
	    <form action="status.jsp">
	      <input type="text" id="login" class="fadeIn second" name="login" placeholder="Benutzername">
	      <input type="password" id="password" class="fadeIn third" name="login" placeholder="Passwort">
	      <input type="submit" class="fadeIn fourth" value="Anmelden">
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