package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	
	//1. By locator :
	
	private WebDriver driver;
	
	private By user = By.id("input-email");
	
	private By password = By.id("input-password");
	
	private By loginButton = By.xpath("//input[@value=\"Login\"]");
	
	private By newUserButton = By.xpath("//a[text()= \"Continue\"]");
	


	//2. Constructor of the page class 
	
	public LoginPage (WebDriver driver) {
		
		this.driver = driver;	
	}
	


	//3. page actions : Features(behavior) of the page 
	public String getLoginPageTitle() {
		return driver.getTitle();
		
	}
	
	public boolean isnewUserButtonPresent () {
		
		return driver.findElement(newUserButton).isDisplayed();
	}
	public void enterUserName (String userName) {
		
		driver.findElement(user).sendKeys(userName);
	}
	public void enterPwd (String pwd) {
		
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLogin () {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement loginB = driver.findElement(loginButton);
		js.executeScript("window.scrollBy(0,1000)");
		loginB.click();
		//js.executeScript("arguments[0].scrollIntoView();", loginB);
	}
	
	public AccountPage doLogin (String un, String pwd) {
		System.out.println("login with "+ un + "  "+ pwd);
		driver.findElement(user).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement loginB = driver.findElement(loginButton);
		js.executeScript("window.scrollBy(0,1000)");
		loginB.click();
		
		return new AccountPage(driver);
	}

 }
