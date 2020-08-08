package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element library
	@FindBy(how = How.XPATH, using = "//button[text()= ' Sign In ']")
	WebElement SIGN_IN_BUTTON;
	@FindBy(how = How.NAME, using = "email")
	WebElement EMAIL_FIELD;
	@FindBy(how = How.NAME, using = "password")
	WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "//span[text() = ' Log In ']")
	WebElement LOGIN_BUTTON;

	public void clickSignInButton() {
		SIGN_IN_BUTTON.click();
	}

	public void enterEmail(String email) {
		EMAIL_FIELD.sendKeys(email);
	}

	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}

	public void clickLoginButton() {
		LOGIN_BUTTON.click();
	}

}
