package com.flipkart.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	
	public static WebDriver driver ;
	
	public void launch() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	

	public void windowHandling() {
		
		Set<String> winId = driver.getWindowHandles();
		 List<String> list = new ArrayList();
		 list.addAll(winId);
		 driver.switchTo().window(list.get(1));
		
	}
	
	public void insertText(WebElement elemenetName, String text) throws InterruptedException {
		
		elemenetName.sendKeys(text, Keys.ENTER);
		
	}
	
	

}
