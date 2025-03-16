package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class LoginPage extends ProjectSpecificationMethods {
	
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	WebElement EnterEmail;
	
	@FindBy(id="Password")
	WebElement EnterPassword;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement ClickLoginButton;
	
	public LoginPage enterEmail(String email)
	{
		EnterEmail.sendKeys(email);
		return this;
	}
    
	public LoginPage enterPass(String Pass)
	{
		EnterPassword.sendKeys(Pass);
		return this;
	}
	
	public HomePage clickLoginButton()
	{
		ClickLoginButton.click();
		return new HomePage(driver);
	}
}
