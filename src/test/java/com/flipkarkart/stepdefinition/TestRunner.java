package com.flipkarkart.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src//test//resources//Features//TvPurchase.feature",
		glue = "com.flipkarkart.stepdefinition",
		monochrome = true,
		dryRun = false
		)

public class TestRunner {

}
