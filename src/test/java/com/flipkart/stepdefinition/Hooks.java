package com.flipkart.stepdefinition;

import com.flipkart.resources.CommonActions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonActions {
	
	CommonActions caObj = new CommonActions ();
	
	@Before 
	public void beforeScenario () throws InterruptedException {
		
		System.out.println("Execute before each and eveery scenario");
		caObj.launch();
	}
	
	@After 
	public void afterScenario () {
		System.out.println("Execute before each and eveery scenario");
	}

}
