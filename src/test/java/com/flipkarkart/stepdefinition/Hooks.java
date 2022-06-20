package com.flipkarkart.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before 
	public void beforeScenario () {
		System.out.println("Execute before each and eveery scenario");
	}
	
	@After 
	public void afterScenario () {
		System.out.println("Execute before each and eveery scenario");
	}

}
