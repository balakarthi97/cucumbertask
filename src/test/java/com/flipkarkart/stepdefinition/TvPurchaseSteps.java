package com.flipkarkart.stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class TvPurchaseSteps {
	
	@When("user search tv and choose")
	public void user_search_tv_and_choose() throws InterruptedException {
		
		WebElement mobile = MobilePurchaseSteps.driver.findElement(By.xpath("//input [@type = 'text']")); 
		 mobile.sendKeys("Sumsung tv");
		 mobile.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 MobilePurchaseSteps.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 
		 MobilePurchaseSteps.driver.findElement(By.xpath("(//div [@class = ('_4rR01T')])[1]")).click();
		 
		 Set<String> winId = MobilePurchaseSteps.driver.getWindowHandles();
		 List<String> list = new ArrayList();
		 list.addAll(winId);
		 MobilePurchaseSteps.driver.switchTo().window(list.get(1));
		 
		 WebElement tvName = MobilePurchaseSteps.driver.findElement(By.xpath("//span [@class = 'B_NuCI']"));
		 String tvNameSelect = tvName.getText();
		 System.out.println("Fourth Mobile Name: " + tvNameSelect);
	   

	}

	@When("user add tv to addtocart and doing payment")
	public void user_add_tv_to_addtocart_and_doing_payment() throws InterruptedException {
		
		MobilePurchaseSteps.driver.findElement(By.xpath("//button [text() = 'ADD TO CART']")).click();
		 Thread.sleep(3000);

	}
	
	@When("user search tv and choose add one dim list")
	public void user_search_tv_and_choose_add_one_dim_list(DataTable dataTable) throws InterruptedException {
      List<String> search = dataTable.asList();
		
		WebElement mobile = MobilePurchaseSteps.driver.findElement(By.xpath("//input [@type = 'text']")); 
		 mobile.sendKeys(search.get(1));
		 mobile.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 MobilePurchaseSteps.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 
		 MobilePurchaseSteps.driver.findElement(By.xpath("(//div [@class = ('_4rR01T')])[1]")).click();
		 
		 Set<String> winId = MobilePurchaseSteps.driver.getWindowHandles();
		 List<String> list = new ArrayList();
		 list.addAll(winId);
		 MobilePurchaseSteps.driver.switchTo().window(list.get(1));
		 
		 WebElement tvName = MobilePurchaseSteps.driver.findElement(By.xpath("//span [@class = 'B_NuCI']"));
		 String tvNameSelect = tvName.getText();
		 System.out.println("Selected Tv Name: " + tvNameSelect);
	}
	
	@When("user search tv and choose add one dim map")
	public void user_search_tv_and_choose_add_one_dim_map(DataTable dataTable) throws InterruptedException {
		
		Map<String, String> search = dataTable.asMap(String.class , String.class );
		
		WebElement mobile = MobilePurchaseSteps.driver.findElement(By.xpath("//input [@type = 'text']")); 
		 mobile.sendKeys(search.get("Tv3"),Keys.ENTER);
		 
		 Thread.sleep(3000);
		 MobilePurchaseSteps.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 
		 MobilePurchaseSteps.driver.findElement(By.xpath("(//div [@class = ('_4rR01T')])[1]")).click();
		 
		 Set<String> winId = MobilePurchaseSteps.driver.getWindowHandles();
		 List<String> list = new ArrayList();
		 list.addAll(winId);
		 MobilePurchaseSteps.driver.switchTo().window(list.get(1));
		 
		 WebElement tvName = MobilePurchaseSteps.driver.findElement(By.xpath("//span [@class = 'B_NuCI']"));
		 String tvNameSelect = tvName.getText();
		 System.out.println("Selected Tv Name: " + tvNameSelect);
	}
	
	@When("user search tv and choose {string}")
	public void user_search_tv_and_choose(String name) throws InterruptedException  {
		
		
		WebElement mobile = MobilePurchaseSteps.driver.findElement(By.xpath("//input [@type = 'text']")); 
		 mobile.sendKeys(name);
		 mobile.sendKeys(Keys.ENTER);
		 
		 Thread.sleep(3000);
		 MobilePurchaseSteps.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 
		 MobilePurchaseSteps.driver.findElement(By.xpath("(//div [@class = ('_4rR01T')])[1]")).click();
		 
		 Set<String> winId = MobilePurchaseSteps.driver.getWindowHandles();
		 List<String> list = new ArrayList();
		 list.addAll(winId);
		 MobilePurchaseSteps.driver.switchTo().window(list.get(1));
		 
		 WebElement tvName = MobilePurchaseSteps.driver.findElement(By.xpath("//span [@class = 'B_NuCI']"));
		 String tvNameSelect = tvName.getText();
		 System.out.println("Selected Mobile Name: " + tvNameSelect);
	}

}
