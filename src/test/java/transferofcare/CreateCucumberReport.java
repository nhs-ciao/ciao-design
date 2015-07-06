package transferofcare;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.velocity.exception.VelocityException;

import net.masterthought.cucumber.ReportBuilder;

public class CreateCucumberReport {

	public static void main(String[] args) throws VelocityException, IOException {
		File reportOutputDirectory = new File("target");
		List<String> list = new ArrayList<String>();
		list.add("target/cucumber.json");

		String pluginUrlPath = "";
		String buildNumber = "1";
		String buildProject = "cucumber-jvm";
		boolean skippedFails = true;
		boolean pendingFails = true;
		boolean undefinedFails = true;
		boolean missingFails = true;
		boolean flashCharts = false;
		boolean runWithJenkins = false;
		boolean artifactsEnabled = false;
		String artifactConfig = "";
		boolean highCharts = false;
		boolean parallelTesting = false;

		ReportBuilder reportBuilder = new ReportBuilder(list, reportOutputDirectory, pluginUrlPath, buildNumber,
		    buildProject, skippedFails, pendingFails, undefinedFails, missingFails, flashCharts, runWithJenkins, artifactsEnabled,
		    artifactConfig, highCharts, parallelTesting);
		
		reportBuilder.generateReports();
	}

}
