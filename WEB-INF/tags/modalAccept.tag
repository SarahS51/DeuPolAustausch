<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<div class="modal fade" id="acceptModal" tabindex="-1" role="dialog" aria-labelledby="acceptModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="genConModalLabel">Zusage</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close" id="modalCloseButton">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <form>
      <div class="modal-body">
		  <div class="form-group">
		    <label for="labelAcceptPupil">Vorname vom/von Schüler*in</label>
		    <input type="text" class="form-control" id="inputFirstnamePupil">
		  </div>
  		  <div class="form-group">
		    <label for="labelAcceptPupil">Nachname vom/von Schüler*in</label>
		    <input type="text" class="form-control" id="inputLastnamePupil">
		  </div>
  		  <div class="form-group">
		    <label for="labelExchangeYear">Austauschprogramm Jahr</label>
		    <input type="text" class="form-control" id="inputExchangeYear">
		  </div>
		  <div class="form-group">
		    <label for="labelNrPupil">Anzahl Schüler*innen</label>
		    <input type="text" class="form-control" id="inputNrPupil">
		  </div>
		  <hr>
		  <div class="form-group">
		    <label for="labelJourneyStartDate">Hinfahrt am</label>
		    <input type="date" class="form-control" name="trip-start" id="idJourneyStartDate" min="2021-01-01" max="2050-12-31">
		  </div>
		  <div class="form-group">
		    <label for="labelJourneyStartHour">Abfahrt um</label>
		    <input type="text" class="form-control" id="idJourneyStartHour">
		  </div>
		  <div class="form-group">
		    <label for="labelJourneyStartFrom">Abfahrt von</label>
		    <input type="text" class="form-control" id="idJourneyStartFrom">
		  </div> 
		  <hr>
	  	  <div class="form-group">
		    <label for="labelJourneyEndDate">Rückfahrt am</label>
		    <input type="date" class="form-control" name="trip-start" id="idJourneyEndDate" min="2021-01-01" max="2050-12-31">
		  </div>
		  <div class="form-group">
		    <label for="labelJourneyEndHour">Abfahrt um</label>
		    <input type="text" class="form-control" id="idJourneyEndHour">
		  </div>
		  <div class="form-group">
		    <label for="labelJourneyEndFrom">Abfahrt von</label>
		    <input type="text" class="form-control" id="idJourneyEndFrom">
		  </div>
		  <hr>
		  <div class="form-group">
		    <label for="labelPrepDate">Vorbereitungsseminar am</label>
		    <input type="date" class="form-control" name="trip-start" id="idPrepDate" min="2021-01-01" max="2050-12-31">
		  </div>
		  <div class="form-group">
		    <label for="labelPrepRoom">Konferenzraum</label>
		    <input type="text" class="form-control" id="idPrepRoom">
		  </div>
		  <hr>
		  <div class="form-group">
		    <label for="labelPayment">Restzahlung</label>
		    <input type="text" class="form-control" id="idPayment">
		  </div>
		  <div class="form-group">
		    <label for="labelPaymentDate">Restzahlung frist</label>
		    <input type="text" class="form-control" id="idPaymentDate">
		  </div>
      </div>
      	<div class="modal-footer">
        	<button type="button" class="btn btn-primary">PDF runterladen</button>
      	</div>
      </form>
    </div>
  </div>
</div>
