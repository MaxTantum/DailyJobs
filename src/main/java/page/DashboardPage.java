package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h6[text() = 'Opportunity Status']")
	WebElement OPPORTUNITY_STATUS_LABEL;

	public String getPageTitle() {

		return driver.getTitle();
	}

}
