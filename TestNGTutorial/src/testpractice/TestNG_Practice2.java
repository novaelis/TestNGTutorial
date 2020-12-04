package testpractice;

import org.testng.annotations.Test;

import page.classes.HomePageFactory;
import page.classes.LogInPageFactory;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class TestNG_Practice2 {
	private WebDriver driver;
	private LogInPageFactory lip;
	private HomePageFactory hpf;
	
	@org.testng.annotations.BeforeClass
	@Parameters("baseURL")
	public void setUp(String baseURL) {
		driver = new FirefoxDriver();
		hpf = new HomePageFactory(driver);
		lip = new LogInPageFactory(driver);
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	
	@Test
	public void testMethod1() throws InterruptedException {
		hpf.clickLogInButton();
		lip.fillEmailAddress("test@test.com");
		lip.fillPassword("test");
		Thread.sleep(2000);
		lip.clickLogInButton();
	}

	@AfterClass
	public void cleanUp() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
