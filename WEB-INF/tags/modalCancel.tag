<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<div class="modal fade" id="cancelModal" tabindex="-1" role="dialog" aria-labelledby="cancelModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="genConModalLabel">Stornierung und Rückerstattung</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close" id="modalCloseButton">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <form>
      <div class="modal-body">
		  <div class="form-group">
		    <label for="labelCancelYearDate">Jahr</label>
		    <input type="text" class="form-control" id="idCancelYearDate">
		  </div>
		  <div class="form-group">
		    <label for="labelContributionDate">Datum von Anzahlung</label>
		    <input type="date" class="form-control" name="trip-start" id="idGenConEndDate" min="2021-01-01" max="2050-12-31">
		  </div>
		  <div class="form-group">
		    <label for="labelValueContribution">Höhe Anzahlung</label>
		    <input type="text" class="form-control" id="idValueContribution">
		  </div>
		  <div class="form-group">
		    <label for="labelValueContribution">Höhe Anzahlung</label>
		    <input type="text" class="form-control" id="idValueContribution">
		  </div>	
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary">PDF runterladen</button>
      </div>
      </form>
    </div>
  </div>
</div>
