Feature: Identify failures so a summary can be sent manually
In order to ensure all encounters are processed and made available to the registered GP
As an administrator in the trust
I want to see when documents cannot be sent automatically, so they can be sent manually

Scenario Outline: The source document from the eDischarge system cannot be processed
	Given an input document which <characteristics>
	When the ciao-parser attempts to process the document
	Then a report file should be created with the error: <error>
	And the document should be moved into a failures directory
Examples:
	| characteristics					 	 | error																	  |
	| is unparseable				 		 | The document could not be parsed 										  |
	| has insufficient parseable information | The parsed information in the document did not include all required fields |

Scenario Outline: The document requires enrichment with PDS data, but the enrichment fails
	Given the PDS trace returns <trace_result>
	When the ciao-docs-enricher-pds attempts to process the document
	Then a report file should be created with the error: <error>
	And the document should be moved into a failures directory
Examples:
	| trace_result																	   | error																 |
	| no matches from PDS 															   | the patient could not be matched on PDS 							 |
	| multiple matches from PDS 													   | the patient could not be matched on PDS 							 |
	| single match from PDS, but the patient details dont match the original document  | the patient details on PDS do not match those in the document 	     |
	| single match from PDS, but the GP details dont match the original document 	   | the patients GP details from PDS do not match those in the document |
	