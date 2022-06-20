package com.flipkarkart.stepdefinition;

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

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class MobilePurchaseSteps {
	
	static WebDriver driver ;
	
	@Given("user launches flipkart application")
	public void user_launches_flipkart_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		  driver.manage().window().maximize();
	   
	}

	@Given("user login flipkart with login credentials")
	public void user_login_flipkart_with_login_credentials() throws InterruptedException {
		WebElement log = driver.findElement(By.xpath("(//input [@type = 'text'])[2]"));
		  log.sendKeys("9688593090");
			 
			 WebElement pass = driver.findElement(By.xpath("//input [@type = 'password']"));
			 pass.sendKeys("bala@123");
			 
				WebElement logIn = driver.findElement(By.xpath("(//button [@type = 'submit'])[2]")); 
		    	logIn.click();
				 
				 Thread.sleep(3000);
				 
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@When("user search mobile and choose")
	public void user_search_mobile_and_choose() throws InterruptedException {
		
		WebElement mobile = driver.findElement(By.xpath("//input [@type = 'text']")); 
		 mobile.sendKeys("Realme Mobile");
		 mobile.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 
       driver.findElement(By.xpath("(//div [@class = ('_4rR01T')])[1]")).click();
		 
		 Set<String> winId = driver.getWindowHandles();
		 List<String> list = new ArrayList();
		 list.addAll(winId);
		 driver.switchTo().window(list.get(1));
		 
		 WebElement mobile4 = driver.findElement(By.xpath("//span [@class = 'B_NuCI']"));
		 String mobile1Name = mobile4.getText();
		 System.out.println("Fourth Mobile Name: " + mobile1Name);
	   
	}

	@When("user add mobile to addtocart and doing payment")
	public void user_add_mobile_to_addtocart_and_doing_payment() throws InterruptedException {
		
		driver.findElement(By.xpath("//button [text() = 'ADD TO CART']")).click();
		 Thread.sleep(3000);
	  
	}

	@Then("user validates confirmation message")
	
	
	public void user_validates_confirmation_message() throws InterruptedException {
		
		 Set<String> winId = driver.getWindowHandles();
		 List<String> list = new ArrayList();
		 list.addAll(winId);
		 driver.switchTo().window(list.get(1));
		Thread.sleep(5000);
		
		 WebElement placeOrder = driver.findElement(By.xpath("//span [text() = 'Place Order']"));
		
		 Assert.assertTrue(placeOrder.isDisplayed());
	   
	}
	
	
	@When("user search mobile and choose add one dim lists")
	public void user_search_mobile_and_choose_add_one_dim_lists(DataTable dataTable) throws InterruptedException {
      List<String> search = dataTable.asList();
		
		WebElement mobile = driver.findElement(By.xpath("//input [@type = 'text']")); 
		 mobile.sendKeys(search.get(1));
		 mobile.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 
          driver.findElement(By.xpath("(//div [@class = ('_4rR01T')])[1]")).click();
		 
		 Set<String> winId = driver.getWindowHandles();
		 List<String> list = new ArrayList();
		 list.addAll(winId);
		 driver.switchTo().window(list.get(1));
		 
		 WebElement mobile4 = driver.findElement(By.xpath("//span [@class = 'B_NuCI']"));
		 String mobile1Name = mobile4.getText();
		 System.out.println("Selected Mobile Name: " + mobile1Name);
	}
	
	@When("user search mobile and choose add one dim maps")
	public void user_search_mobile_and_choose_add_one_dim_maps(DataTable dataTable) throws InterruptedException {
		
		Map<String, String> search = dataTable.asMap(String.class , String.class );
		
		WebElement mobile = driver.findElement(By.xpath("//input [@type = 'text']")); 
		 mobile.sendKeys(search.get("Phone3"),Keys.ENTER);
		 
		 Thread.sleep(3000);
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 
          driver.findElement(By.xpath("(//div [@class = ('_4rR01T')])[1]")).click();
		 
		 Set<String> winId = driver.getWindowHandles();
		 List<String> list = new ArrayList();
		 list.addAll(winId);
		 driver.switchTo().window(list.get(1));
		 
		 WebElement mobile4 = driver.findElement(By.xpath("//span [@class = 'B_NuCI']"));
		 String mobile1Name = mobile4.getText();
		 System.out.println("Selected Mobile Name: " + mobile1Name);
	}
	
	@When("user search mobile and choose {string}")
	public void user_search_mobile_and_choose(String name) throws InterruptedException  {
		
		
		WebElement mobile = driver.findElement(By.xpath("//input [@type = 'text']")); 
		 mobile.sendKeys(name);
		 mobile.sendKeys(Keys.ENTER);
		 
		 Thread.sleep(3000);
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 
          driver.findElement(By.xpath("(//div [@class = ('_4rR01T')])[1]")).click();
		 
		 Set<String> winId = driver.getWindowHandles();
		 List<String> list = new ArrayList();
		 list.addAll(winId);
		 driver.switchTo().window(list.get(1));
		 
		 WebElement mobile4 = driver.findElement(By.xpath("//span [@class = 'B_NuCI']"));
		 String mobile1Name = mobile4.getText();
		 System.out.println("Selected Mobile Name: " + mobile1Name);
	}
}