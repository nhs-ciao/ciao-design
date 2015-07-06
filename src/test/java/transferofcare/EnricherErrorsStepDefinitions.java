package transferofcare;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import cucumber.table.DataTable;


public class EnricherErrorsStepDefinitions {
	
	@Given("^the PDS trace returns (.*)$")
	public void the_PDS_trace_returns(String pds_result) {
	    throw new PendingException();
	}
	
	@When("^the ciao-docs-enricher-pds attempts to process the document$")
	public void the_ciao_docs_enricher_pds_attempts_to_process_the_document() {
	    throw new PendingException();
	}
}
