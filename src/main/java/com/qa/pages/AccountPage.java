package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
	
	private WebDriver driver;
	
	private By accountSections = By.cssSelector("div.list-group");
	
	public AccountPage(WebDriver driver) {
		
		this.driver = driver;
	}
	public int getAccountSectionCount() {
		return driver.findElements(accountSections).size();
	}
	public String getAccountPageTitle () {
		return driver.getTitle();
	}
	public List<String> getAccountSectionsList() {
		
		List<String> accountList = new ArrayList<String>();
		List<WebElement> accountHeaderList = driver.findElements(accountSections);
		
		for (WebElement e : accountHeaderList) {
			
			String text = e.getText();
			System.out.println(text);
			accountList.add(text);
		}
		return accountList;
	}
}
