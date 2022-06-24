package com.flipkart.stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.objectrepository.MobilePurchasePage;
import com.flipkart.resources.CommonActions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class MobilePurchaseSteps extends CommonActions {
	
	CommonActions caObj = new CommonActions ();
	MobilePurchasePage pageObject = new MobilePurchasePage();
	static WebDriver driver ;
	
	@Given("user launches flipkart application")
	public void user_launches_flipkart_application() {
	}

	@Given("user login flipkart with login credentials")
	public void user_login_flipkart_with_login_credentials() throws InterruptedException {
		
		pageObject.getLog().sendKeys("9688593090");

		pageObject.getPass().sendKeys("bala@123");
			 
		pageObject.getLogIn().click(); 
		Thread.sleep(3000);
	}

	@When("user search mobile and choose")
	public void user_search_mobile_and_choose() throws InterruptedException {
		
		pageObject.getSearch().sendKeys("realme", Keys.ENTER); 
		 Thread.sleep(3000);
		 
		 pageObject.getClick().click();
		 
		 caObj.windowHandling();
		 
		 WebElement mobile4 = pageObject.getSelectedMobileName();
		 String mobile1Name = mobile4.getText();
		 System.out.println("Fourth Mobile Name: " + mobile1Name);
	   
	}

	@When("user add mobile to addtocart and doing payment")
	public void user_add_mobile_to_addtocart_and_doing_payment() throws InterruptedException {
		
		pageObject.getAddToCart().click();
		 Thread.sleep(3000);
	  
	}

	@Then("user validates confirmation message")
	public void user_validates_confirmation_message() throws InterruptedException {
		caObj.windowHandling();
		Thread.sleep(5000);
		
		 WebElement placeOrder = pageObject.getPlaceOrder();
		 Assert.assertTrue(placeOrder.isDisplayed());
	   
	}
	
	
	@When("user search mobile and choose add one dim lists")
	public void user_search_mobile_and_choose_add_one_dim_lists(DataTable dataTable) throws InterruptedException {
      List<String> search = dataTable.asList();
		
      pageObject.getSearch().sendKeys(search.get(1),Keys.ENTER); 
		 
		 pageObject.getClick().click();
		 
          caObj.windowHandling();
          
		 WebElement mobile4 = pageObject.getSelectedMobileName();
		 String mobile1Name = mobile4.getText();
		 System.out.println("Selected Mobile Name: " + mobile1Name);
	}
	
	@When("user search mobile and choose add one dim maps")
	public void user_search_mobile_and_choose_add_one_dim_maps(DataTable dataTable) throws InterruptedException {
		
		Map<String, String> search = dataTable.asMap(String.class , String.class );
		
		pageObject.getSearch().sendKeys(search.get("Phone3"),Keys.ENTER);
		
		 Thread.sleep(3000);
		 pageObject.getClick().click();
		 
		 caObj.windowHandling();
		 
		 WebElement mobile4 = pageObject.getSelectedMobileName();
		 String mobile1Name = mobile4.getText();
		 System.out.println("Selected Mobile Name: " + mobile1Name);
	}
	
	@When("user search mobile and choose {string}")
	public void user_search_mobile_and_choose(String name) throws InterruptedException  {
		
		
		pageObject.getSearch().sendKeys(name , Keys.ENTER); 
		 Thread.sleep(3000);
		 
		 pageObject.getClick().click();
		 
          caObj.windowHandling();
		 
		 WebElement mobile4 = pageObject.getSelectedMobileName();
		 String mobile1Name = mobile4.getText();
		 System.out.println("Selected Mobile Name: " + mobile1Name);
	}
}