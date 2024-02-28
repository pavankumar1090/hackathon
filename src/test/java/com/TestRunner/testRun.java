package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					
					features= {".//Features/"},
					glue="com.StepDefinations",
					plugin= {"pretty", "html:reports/myreport.html",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class testRun {
	

}