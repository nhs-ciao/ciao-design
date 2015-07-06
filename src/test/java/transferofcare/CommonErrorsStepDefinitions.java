package transferofcare;

import cucumber.annotation.en.Then;
import cucumber.runtime.PendingException;



public class CommonErrorsStepDefinitions {
	@Then("^the document should be moved into a failures directory$")
    public void the_document_should_be_moved_into_a_failures_directory() {
        throw new PendingException();
    }
	
	@Then("^a report file should be created with the error: (.*)$")
	public void a_report_file_should_be_created_with_the_appropriate_error(String error) {
	    throw new PendingException();
	}
}
