package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.DashboardPage;
import page.LoginPage;
import util.Assertion;
import util.Browser;

public class LoginSteps {

	WebDriver driver;
	LoginPage loginpage; // = PageFactory.initElements(driver, LoginPage.class);
	DashboardPage dashboardPage;

	@Given("^I am on daily\\.jobs site$")
	public void i_am_on_daily_jobs_site() {
		driver = Browser.startBrowser();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);

	}

	/*@When("^I enter email and password$")
	public void i_enter_email_and_password() {
		loginpage.clickSignInButton();
		loginpage.enterEmail("roustame4@gmail.com");
		loginpage.enterPassword("Qwerty7");

	}*/
	
	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String email, String password) throws Throwable {
		loginpage.clickSignInButton();
		loginpage.enterEmail(email);
		loginpage.enterPassword(password);
	}

	@And("^I click on Login button$")
	public void i_click_on_Login_button() {
		loginpage.clickLoginButton();

	}

	@Then("^Dashboard page should display$")
	public void dashboard_page_should_display() {
		String expected = "daily.jobs";
		Assertion.equals("WrOnG PaGe!!!!", dashboardPage.getPageTitle(), expected);
		
		Browser.tearDown();
	}

}
