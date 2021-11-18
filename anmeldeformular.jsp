<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Persönliches</title>
	<tag:header/>
</head>
<body>
	<tag:navigationbar/>
	
	<h2 class="text-center" id="titleSite">Anmeldeformular</h2>
	<div style="padding-left:2%; padding-right:2%;">
		<div style="padding-left:2%; padding-right:2%;">
			<h4>Wichtig!</h4>
			<p class="text-justify">
				Ambitioni dedisse scripsisse iudicaretur. Cras mattis iudicium purus sit amet fermentum. Donec sed odio operae, eu vulputate felis rhoncus. Praeterea iter est quasdam res quas ex communi. At nos hinc posthac, sitientis piros Afros. Petierunt uti sibi concilium totius Galliae in diem certam indicere. Cras mattis iudicium purus sit amet fermentum.
			</p>
			<p class="text-justify">
				Ambitioni dedisse scripsisse iudicaretur. Cras mattis iudicium purus sit amet fermentum. Donec sed odio operae, eu vulputate felis rhoncus. Praeterea iter est quasdam res quas ex communi. At nos hinc posthac, sitientis piros Afros. Petierunt uti sibi concilium totius Galliae in diem certam indicere. Cras mattis iudicium purus sit amet fermentum.
				Ambitioni dedisse scripsisse iudicaretur. Cras mattis iudicium purus sit amet fermentum. Donec sed odio operae, eu vulputate felis rhoncus. Praeterea iter est quasdam res quas ex communi. At nos hinc posthac, sitientis piros Afros. Petierunt uti sibi concilium totius Galliae in diem certam indicere. Cras mattis iudicium purus sit amet fermentum.
			</p>
			<p class="text-justify">
				<div class="form-row">
				  <div class="col-7 text-info">
				  	Verpflichtende Restzahlung in Höhe von 180,00 EUR durch Banküberweisung
				  </div>
				  <div class="col">
				  <table>
				  	<tr>
				  		<td class="text-secondary">Empfänger:</td>
				  		<td>Förderverein des BK Georg-Simon-Ohm</td>
				  	</tr>
					<tr>
				  		<td class="text-secondary">IBAN:</td>
				  		<td>DE76 3705 0198 0014 6320 79</td>
				  	</tr>
 					<tr>
				  		<td class="text-secondary">Verwendungszweck:</td>
				  		<td>Warschau20XX/ Nachname/ Vorname</td>
				  	</tr>
				  	<tr>
				  		<td colspan="2" class="text-danger">
				  			<small>(Verwendungszeck in folgendem Format angeben: "Warschau2021/ Mustermann/ Max")</small>
				  		</td>
				  	</tr>
				  </table>				  
				  </div>
				</div>
			</p>
		</div>
		<hr>
		<div>
			<form>
				<div class="form-group">
					<h5>Personaldaten</h5>
					<div class="form-group">
					  <label for="labelLastname">Nachname:</label>
					  <input type="text" class="form-control" id="inputLastname" placeholder="Max">
					</div>
					<div class="form-group">
					  <label for="labelFirstname">Vorname:</label>
					  <input type="text" class="form-control" id="inputFirstname" placeholder="Mustermann">
					</div>				
					<div class="form-group">
					  <label for="labelBirthdate">Geburtsdatum:</label>
					  <input type="text" class="form-control" id="inputBirthdate" placeholder="TT.MM.JJJJ">
					</div>
				</div>
				<hr>
				<div class="form-group">
					<h5>Volljährig</h5>
					<div class="form-group">
						<div class="form-check form-check-inline">
						  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="adultYes">
						  <label class="form-check-label" for="inlineRadio1">Ja</label>
						</div>
						<div class="form-check form-check-inline">
						  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="adultNo">
						  <label class="form-check-label" for="inlineRadio2">Nein</label>
						  
						</div>
						<p class="text-danger">(Bitte wählen Sie aus; Bei Minderjährigkeit füllen Sie den Eltern teil auch aus)</p>
					</div>
				</div>
				<hr>
				<div class="form-group">
					<h5>Anschrift</h5>
					<div class="form-group">
						<div class="form-row">
						  <div class="col-7">
		  					<label for="labelStreet">Staße:</label>
						    <input type="text" class="form-control" placeholder="Musterstraße">
						  </div>
						  <div class="col">
		  					<label for="labelStreetNr">Hausnummer:</label>
						    <input type="text" class="form-control" placeholder="2">
						  </div>
						  <div class="col">
		  					<label for="labelStreetAdd">Zusatz:</label>
						    <input type="text" class="form-control" placeholder="B">
						  </div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
						  <div class="col-7">
		  					<label for="labelPLZ">Postleitzahl:</label>
						    <input type="text" class="form-control" placeholder="51105" id="inputPLZ">
						  </div>
						  <div class="col">
		  					<label for="labelCity">Wohnort:</label>
						    <input type="text" class="form-control" placeholder="Köln" id="inputCity">
						  </div>
						</div>
					</div>
				<hr>
				<div class="form-group">
					<h5>Erreichbar unter</h5>
					<div class="form-group">
					  <label for="labelMobile">Mobilfunknummer:</label>
					  <input type="text" class="form-control" id="inputMobile" placeholder="+49 123 456789101">
					</div>
					<div class="form-group">
					  <label for="labelEmail">E-Mail-Adresse:</label>
					  <input type="text" class="form-control" id="inputEmail" placeholder="Name@Email.de">
					</div>				
				</div>
				<hr>
				<div class="form-group">
					<h5>Klasse</h5>
					<div class="form-group">
					  <label for="lableClass">Name:</label>
					  <input type="text" class="form-control" id="inputClassName" placeholder="FIA9A">
					</div>			
				</div>
				<hr>
				<div class="form-group">
					<h5>Klassenlehrer</h5>
					<div class="form-group">
					  <label for="lableTeacher">Name:</label>
					  <input type="text" class="form-control" id="inputTeacherName" placeholder="Max Mustermann">
					</div>			
				</div>
				<hr>
				<div class="form-group">
					<h5>Besondere Ernährung?</h5>
					  <div class="form-group">
					    <label for="exampleFormControlTextarea1" class="text-info">(Allergien, Vegatarier, ...)</label>
					    <textarea class="form-control" id="textareaDiet" rows="3"></textarea>
					  </div>
				</div>
				<hr>
				<div class="form-group">
					<h5>Körperliche Beeinträchtigungen, die ein Gruppenleiter kennen sollte:</h5>
					  <div class="form-group">
					    <textarea class="form-control" id="textareaHealth" rows="3"></textarea>
					  </div>
				</div>
				<hr>
				<div class="form-group">
					<h5>Wer soll bei einem Unfall benachrichtigt werden?</h5>
					  <div class="form-group">
  						<div class="form-row">
						  <div class="col-7">
		  					<label for="lableContactPerson">Name:</label>
						    <input type="text" class="form-control" placeholder="Max Mustermann" id="inputContactPersonName">
						  </div>
						  <div class="col">
		  					<label for="lableContactPersonTel">Telefonnummer:</label>
						    <input type="text" class="form-control" placeholder="+49 123 456789101" id="inputContactPersonTel">
						  </div>
						</div>
					  </div>
				</div>
				<hr>
				<button type="submit" class="btn btn-primary">Dokument in PDF umwandeln!</button>
			</form>
		</div>
	</div>
    <tag:scripts/>
</body>
</html>