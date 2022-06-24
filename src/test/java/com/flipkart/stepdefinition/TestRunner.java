package com.flipkart.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src//test//resources//Features//MobilePurchase.feature",
		glue = "com.flipkart.stepdefinition",
		monochrome = true,
		dryRun = false,
		tags = "@Sanity"
		)

public class TestRunner {

}
