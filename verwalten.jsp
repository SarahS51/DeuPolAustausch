<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<jsp:useBean id="userInfo" class="user.UserInformation" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
		<title>Insert title here</title>
    	<tag:header/>
</head>
<body>
	<tag:navigationbar/>
	<h1 class="text-center" id="titleSite">
		Verwalten
	</h1>
	<div id="content">
		<div class="container">
			<div class="row">
				<div class="col">
					<h5>
						<strong>Rahmenbedingungen</strong>
					</h5>
				</div>
				<div class="col d-flex justify-content-center">
					<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#genConModal">Generieren!</button>
				</div>
				<div class="col">
					<p>
						zuletzt geändert am TT.DD.JJJJ
					</p>
				</div>
			</div>
			<hr>	
			<div class="row">
				<div class="col">
					<h5>
						<strong>Stronierung und Rückerstattung</strong>
					</h5>
				</div>
				<div class="col d-flex justify-content-center">
					<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#cancelModal">Generieren!</button>
				</div>
				<div class="col">
					<p>
						zuletzt geändert am TT.DD.JJJJ
					</p>
				</div>
			</div>
			<hr>		
			<div class="row">
				<div class="col">
					<h5>
						<strong>Zusage</strong>
					</h5>
				</div>
				<div class="col d-flex justify-content-center">
					<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#acceptModal">Generieren!</button>
				</div>
				<div class="col">
					<p>
						zuletzt geändert am TT.DD.JJJJ
					</p>
				</div>
			</div>
			<hr>		
			<div class="row">
				<div class="col">
					<h5>
						<strong>Schülerliste</strong>
					</h5>
				</div>
				<div class="col d-flex justify-content-center">
					<button type="button" class="btn btn-primary btn-lg">Generieren!</button>
				</div>
				<div class="col">
					<p>
						zuletzt geändert am TT.DD.JJJJ
					</p>
				</div>
			</div>
			<hr>
			<div class="row">
				<div class="col">
					<h5>
						<strong>Registrierungsschlüssel</strong>
					</h5>
				</div>
				<div class="col d-flex justify-content-center" >
					<!-- Button trigger modal -->
					<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#regKeyModal">
					  Generieren!
					</button>
				</div>
				<div class="col">
					<strong>XXXXXXXXXXXXXXXX</strong>
				</div>
			</div>
			<hr>
			<h5 class="text-center" id="titleSite"><strong>Anwesenheitsliste</strong></h5>
			<table class="table table-bordered">
			  <thead>
			    <tr>
			      <th scope="col">Nr.</th>
			      <th scope="col">Name</th>
			      <th scope="col">Vorname</th>
			      <th scope="col">Klasse</th>
			      <th scope="col">Klassenlehrer</th>
			      <th scope="col">Anwesenheit</th>
			    </tr>
			  </thead>
			  <tbody>
			    <tr>
			      <th scope="row">1</th>
			      <td>Mark</td>
			      <td>Otto</td>
			      <td>FIA9A</td>
			      <td>Volker Stern</td>
			      <td>
			      <button type="button" class="btn" id="anwesend">Anwesend</button>
			      <button type="button" class="btn" id="entschuldigt">Entschuldigt</button>
			      <button type="button" class="btn" id="fehlt">Fehlt</button>
			      </td>
			    </tr>
			  </tbody>
			</table>
		</div>
	</div>
	<tag:modalAccept/>
	<tag:modalCancel/>
	<tag:modalGenCon/>
	<tag:modalRegKey/>
	<tag:scripts/>
</body>
</html>