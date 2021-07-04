package org.testrunner;

import org.baseclass.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles",glue="org.stepdefinition",dryRun=false, monochrome=true, 
strict=false, snippets=SnippetType.CAMELCASE, tags= {"@login"}, 
plugin= {"pretty", "html:src\\test\\resources\\Reports",
		"json:src\\test\\resources\\Reports\\output.json",
		"junit:src\\test\\resources\\Reports\\hotel.xml"})
public class TestRunner {
	@AfterClass
	public static void jvmReportGeneration() {
		JvmReport.generateJvmReport(System.getProperty("user.dir")+
			"\\src\\test\\resources\\Reports\\output.json");
	}
}