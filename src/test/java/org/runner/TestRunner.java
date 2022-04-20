package org.runner;

import org.avmreport.JvmReportt;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
glue="org.stepdefinition",dryRun=false,monochrome=true, plugin= {"pretty",
		"html:D:\\Agil\\PhotonWorkspace\\CucumberFrame\\target\\htmlReport",
		"json:D:\\Agil\\PhotonWorkspace\\CucumberFrame\\target\\jsonreport\\jsonreport.json",
		"junit:D:\\Agil\\PhotonWorkspace\\CucumberFrame\\target\\junitreport\\junitreport.xml"})
public class TestRunner {
	@AfterClass
	public static void Report() {
		JvmReportt.generateJVMReport("src\\test\\resources\\JVMReports\\Jsonreport.json");
		System.out.println("Report vandhuduchi");
		}
	

}
