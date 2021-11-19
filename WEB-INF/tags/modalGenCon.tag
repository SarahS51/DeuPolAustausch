<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<div class="modal fade" id="genConModal" tabindex="-1" role="dialog" aria-labelledby="genConModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="genConModalLabel">Rahmenbedingungen</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close" id="modalCloseButton">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <form>
      <div class="modal-body">
		  <div class="form-group">
		    <label for="labelGenConStartDate">von</label>
		    <input type="date" class="form-control" name="trip-start" id="idGenConStartDate" min="2021-01-01" max="2050-12-31">
		  </div>
		  <div class="form-group">
		    <label for="labelGenConEndDate">Bis</label>
		    <input type="date" class="form-control" name="trip-start" id="idGenConEndDate" min="2021-01-01" max="2050-12-31">
		  </div>
		  <div class="form-group">
		    <label for="labelGenConDeadlineDate">Frist</label>
		    <input type="date" class="form-control" name="trip-start" id="idGenConDeadlineDate" min="2021-01-01" max="2050-12-31">
		  </div>		
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary">PDF runterladen</button>
      </div>
      </form>
    </div>
  </div>
</div>
