package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {

	@Test
	public void tc_001()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElementById("email").sendKeys("uname");;
		driver.findElementById("pass").sendKeys("pass");
		driver.quit();
	}
}
