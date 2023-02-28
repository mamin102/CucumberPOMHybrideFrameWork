package Stepdefinition;

import org.junit.Assert;

import com.qa.factory.DriverFactory;
import com.qa.pages.LoginPage;
import com.qa.pages.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageSteps {
	private static String title;
	private RegisterPage registerPage = new RegisterPage (DriverFactory.getDriver());
	
	@Given("user in on the login page")
	public void user_in_on_the_login_page() {
		DriverFactory.getDriver().get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	}

	@When("user clicks on the new customer button")
	public void user_clicks_on_the_new_customer_button() {
		
		registerPage.clickOnNewUserButton();
	    
	}
//	@When("user gets the title of the page")
//	public void user_gets_the_title_of_the_page() throws InterruptedException {
//		Thread.sleep(5000);
//		title = registerPage.getRegisterPageTitle();
//		System.out.println("###### Register page title is : "+ title);
//	}
//
//	@Then("page title should be {string}")
//	public void page_title_should_be(String e_title) throws InterruptedException {
//	
//		Thread.sleep(10000);
//		Assert.assertTrue(title.contains(e_title));
//	}

	@Then("user enter FirstName {string}")
	public void user_enter_first_name(String firstName) {
		registerPage.enterFristName(firstName);
	    
	}

	@Then("user enter LastName {string}")
	public void user_enter_last_name(String lastName) {
	  registerPage.enterlastName(lastName);
	}
	@Then("user enter email {string}")
	public void user_enter_email(String email) {
	   registerPage.enterEmail(email);
	}

	@Then("user enter Telephone {string}")
	public void user_enter_telephone(String tele) {
	   registerPage.enterPhone(tele);
	}

	@Then("user enter password {string}")
	public void user_enter_password(String pwd) {
	   registerPage.enterPassword(pwd);
	}

	@Then("user enter Confirm password {string}")
	public void user_enter_confirm_password(String conPwd) {
	  registerPage.enterConPassword(conPwd);
	}

	@Then("user choose the newsletter Subscribe option")
	public void user_choose_the_newsletter_subscribe_option() {
	   registerPage.chooseSubscribionOption();
	}

	@Then("user agrees to the Privecy Policy")
	public void user_agrees_to_the_privecy_policy() {
	    registerPage.agreeToPrivacyPolicy();
	}

	@Then("user click on the Continue button")
	public void user_click_on_the_Continue_button() throws InterruptedException {
	    registerPage.Submit();
	    Thread.sleep(5000);
	}

	@Then("user should get a massage {string}")
	public void user_should_get_a_massage(String string) throws InterruptedException {
	    registerPage.isSuccessMessageDisplayed();
	    Thread.sleep(5000);
	}

	@Then("user click on the successPage Continue button")
	public void user_click_on_the_successPage_Continue_button() {
	    registerPage.clickOnContinue();
	}
	
	
}
