package Stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.qa.factory.DriverFactory;
import com.qa.pages.AccountPage;
import com.qa.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountPageSteps {

	
	private LoginPage loginPage = new LoginPage (DriverFactory.getDriver());
	private AccountPage accountPage;
	
	@Given("user is already logged in to application")
	public void user_is_already_logged_in_to_application(DataTable credTable) {
		
		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String pass = credList.get(0).get("password");
		
		DriverFactory.getDriver().get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		accountPage = loginPage.doLogin(userName, pass);
		
	}

	@Given("user is on the accounts page")
	public void user_is_on_the_accounts_page() {
		
		String title =	accountPage.getAccountPageTitle();
	  System.out.println("Account page title = "+ title);
	}

	@Then("user gets accounts sections")
	public void user_gets_accounts_sections(DataTable sectionTable) {
		List<String> expAccontSectionList =sectionTable.asList();
		System.out.println("expected account section list = "+ expAccontSectionList);
		
		List<String> actualAccountSectionList = accountPage.getAccountSectionsList();
		System.out.println("Actual account section list = "+ actualAccountSectionList);
		
		//Assert.assertTrue(expAccontSectionList.containsAll(actualAccountSectionList));
	}

	@Then("accounts section count should be {int}")
	public void accounts_section_count_should_be(Integer expectedSectionCount) {
	//  Assert.assertTrue(accountPage.getAccountSectionCount()== expectedSectionCount);
	}

	
	
}
