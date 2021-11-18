<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Registrierung</title>
    <tag:header/>
</head>
<body>
<tag:logoGSO></tag:logoGSO>
	<h1 class="text-center">Registrierung</h1>
	<div style="padding-left:2%; padding-right:2%;">
		<form style="padding-top:5%;" action="anmeldeformular.jsp">
		  <div class="form-row">
		    <div class="form-group col-md-6">
			  <div class="form-group">
			    <label for="labelUsername">Benutzername:</label>
			    <input type="text" class="form-control" id="inputfieldUsername" placeholder="Benutzername">
			  </div>
  			  <div class="form-group">
			    <label for="labelEMail">E-Mail-Adresse</label>
			    <input type="email" class="form-control" id="inputfieldEMail" placeholder="name@gso.schule.koeln">
			  </div>
  			  <div class="form-group">
			    <label for="labelRegKey">Registrierungsschlüssel</label>
			    <input type="text" class="form-control" id="inputRegKey" placeholder="XXXXXXXXXXXXXXXX">
			  </div>
		    </div>
		    <div class="form-group col-md-6">
			  <div class="form-group">
			  	<h2 class="text-center">Informationen</h2>
			    <p>
			    	Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. 
			    	At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.
			    	At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. 	
			    	Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.
			    </p>
			  </div>
		    </div>		   
		  </div>
		  <button type="submit" class="btn btn-primary">Registrieren!</button>
		  <a class="btn btn-primary" href="index.jsp" role="button" id="backButton">Zurück</a>
		</form>	
	</div>
	<tag:scripts></tag:scripts>
	</body>
</html>