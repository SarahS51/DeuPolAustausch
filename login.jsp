<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<jsp:useBean id="userInfo" class="user.UserInformation" scope="session"/>
<!DOCTYPE html>
<%
boolean justLoggedOut = false;
if(userInfo.getUser().isLogin()) {
	userInfo.getUser().setLogin(false);
	justLoggedOut = true;
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
		<%
		if(justLoggedOut) {
		%>
			<h4 class="text-center">erfolgreich ausgeloggt!</h4>
		<% 
		} else {
		%>
	    <!-- Login Form -->
	    <form action="anmeldeformular.jsp">
	      <input type="text" id="login" class="fadeIn second" name="loginName" placeholder="Benutzername">
	      <input type="password" id="password" class="fadeIn third" name="loginPassword" placeholder="Passwort">
	      <input type="submit" name="login" class="fadeIn fourth" href="anmeldeformular.jsp" value="Anmelden" >
	    </form>
	
	    <!-- Remind Passowrd -->
	    <div id="formFooter">
	      <a class="underlineHover" href="registrierung.jsp">Registrieren</a>
	    </div>
		<%
		}
		%>
	  </div>
	</div>
    <tag:scripts/>
</body>
</html>