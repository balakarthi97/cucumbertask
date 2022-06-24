package com.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.CommonActions;

public class MobilePurchasePage extends CommonActions{
	
	public MobilePurchasePage()  {
		
		PageFactory.initElements(driver, this) ;
	}
	
	@FindBy(xpath="(//input [@type = 'text'])[2]")
	private WebElement log;
	
	@FindBy(xpath="//input [@type = 'password']")
	private WebElement pass;
	
	@FindBy(xpath="(//button [@type = 'submit'])[2]")
	private WebElement logIn;
	
	@FindBy(xpath="//input [@type = 'text']")
	private WebElement search;
	
	@FindBy(xpath= "(//div [@class = ('_4rR01T')])[1]")
	private WebElement click;
	
	@FindBy(xpath= "//span [@class = 'B_NuCI']")
	private WebElement selectedMobileName;
	
	@FindBy(xpath= "//button [text() = 'ADD TO CART']")
	private WebElement addToCart;
	
	@FindBy(xpath= "//span [text() = 'Place Order']")
	private WebElement placeOrder;
	

	public WebElement getPlaceOrder() {
		return placeOrder;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getSelectedMobileName() {
		return selectedMobileName;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getLog() {
		return log;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogIn() {
		return logIn;
	}
	
}

