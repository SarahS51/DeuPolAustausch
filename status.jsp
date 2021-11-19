<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<jsp:useBean id="userInfo" class="user.UserInformation" scope="session">
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Status</title>
	<tag:header></tag:header>
</head>
<body>
	<tag:navigationbar></tag:navigationbar>
	<div class="container" style="margin-top:5%; margin-bottom:5%;">
		<div class="row">
			<div class="col text-center">
				<h1>Status:</h1>
			</div>
			<div class="col">
				<h1>Bezeichnung</h1>
			</div>
		</div>
	</div>
	<tag:scripts/>
</body>
</jsp:useBean>
</html>