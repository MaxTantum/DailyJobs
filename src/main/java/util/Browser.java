package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	static WebDriver driver;

	public static WebDriver startBrowser() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://test:stagingtest456@staging.daily.jobs/");
		return driver;
	}

	public static void tearDown() {
		driver.close();
		driver.quit();
	}

}
