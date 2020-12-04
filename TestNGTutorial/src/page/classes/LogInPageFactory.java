package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPageFactory {
	WebDriver driver;
	
	public LogInPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "user_email")
	WebElement emailAddressTextField;
	
	@FindBy(id = "user_password")
	WebElement passwordTextField;
	
	@FindBy(name = "commit")
	WebElement logInButton;
	
	public void clickLogInButton() {
		logInButton.click();
	}
	
	public void fillEmailAddress(String email) {
		emailAddressTextField.sendKeys(email);
	}
	
	public void fillPassword(String password) {
		passwordTextField.sendKeys(password);
	}

}
