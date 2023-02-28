package Stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.qa.factory.DriverFactory;
import com.qa.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	private static String title;

	private LoginPage loginPage = new LoginPage (DriverFactory.getDriver());
	
	
	

	@Given("user is on the login Page")
	public void user_is_on_the_login_page() {
	   
		DriverFactory.getDriver().get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() throws InterruptedException {
		Thread.sleep(5000);
		title = loginPage.getLoginPageTitle();
		System.out.println("************* page title is ***********: "+ title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String e_title) throws InterruptedException {
	
		Thread.sleep(5000);
		Assert.assertTrue(title.contains(e_title));
	}


	@Then("newUser button is present")
	public void newUser_button_is_present() {
	   
		Assert.assertTrue(loginPage.isnewUserButtonPresent());
		
	}

	@When("user enters userName {string}")
	public void user_enters_user_name(String userName) {
	    loginPage.enterUserName(userName);
	}

	@When("user enters password {string}")
	public void user_enters_password(String pswd) {
	    loginPage.enterPwd(pswd);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		Thread.sleep(5000);
		loginPage.clickOnLogin();
	}


}
