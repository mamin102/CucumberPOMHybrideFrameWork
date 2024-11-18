package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	private WebDriver driver;
	private By newUserButton = By.xpath("//a[text()= \"Continue\"]");
	private By first_Name = By.id("input-firstname");
	private By last_Name = By.id("input-lastname");
	private By email = By.id("input-email");
	private By telephone = By.id("input-telephone");
	private By password = By.id("input-password");
	private By conPassword = By.id("input-confirm");
	private By subscribeRadioButton = By.xpath("(//input[@type= \"radio\"])[3]");
	private By privacyCheckBox = By.xpath("//input[@name=\"agree\"]");
	private By continueButton = By.xpath("//input[@type= \"submit\"]");
	private By successMessage = By.xpath("//h1[text()=\"Your Account Has Been Created!\"]");
	private By successPageContinueButton = By.xpath("//a[text()=\"Continue\"]");

	public RegisterPage(WebDriver driver) {

		this.driver = driver;
	}

	public void clickOnNewUserButton() {

		driver.findElement(newUserButton).click();
	}

	public String getRegisterPageTitle() {
		return driver.getTitle();

	}

	public void enterFristName(String f_N) {
		driver.findElement(first_Name).sendKeys(f_N);

	}

	public void enterlastName(String l_N) {
		driver.findElement(last_Name).sendKeys(l_N);

	}

	public void enterEmail(String e) {
		driver.findElement(email).sendKeys(e);

	}

	public void enterPhone(String p) {

		driver.findElement(telephone).sendKeys(p);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);

	}

	public void enterConPassword(String conPwd) {
		driver.findElement(conPassword).sendKeys(conPwd);

	}

	public void chooseSubscribionOption() {
		driver.findElement(subscribeRadioButton).click();

	}

	public void agreeToPrivacyPolicy() {
		driver.findElement(privacyCheckBox).click();

	}

	public void Submit() {

		driver.findElement(continueButton).click();
	}

	public boolean isSuccessMessageDisplayed() {

		return driver.findElement(successMessage).isDisplayed();
	}

	public void clickOnContinue() {
		driver.findElement(successPageContinueButton).click();
	}
}
