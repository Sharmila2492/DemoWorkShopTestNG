package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class RegisterPage extends ProjectSpecificationMethods {
	
	@FindBy(id="gender-female")
	WebElement ClickGender;
	
	@FindBy(id="FirstName")
	WebElement EnterFirstName;
	
	@FindBy(id="LastName")
	WebElement EnterLastName;
	
	@FindBy(id="Email")
	WebElement EnterEmail;
	
	@FindBy(id="Password")
	WebElement EnterPassword;
	
	@FindBy(id="ConfirmPassword")
	WebElement EnterConPassword;
	
	@FindBy(id="register-button")
	WebElement ClickRegisterButton;
	
	
	public void RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public RegisterPage clickGender()
	{
		ClickGender.click();
		return this;
	}
    
	public RegisterPage enterFirstName(String Fname)
	{
		EnterFirstName.sendKeys(Fname);
		return this;
	}
	
	public RegisterPage enterLastName(String Lname)
	{
		EnterLastName.sendKeys(Lname);
		return this;
	}
	
	public RegisterPage enterEmail(String email)
	{
		EnterEmail.sendKeys(email);
		return this;
	}
	
	public RegisterPage enterPass(String pass)
	{
		EnterPassword.sendKeys(pass);
		return this;
	}
	
	public RegisterPage enterConPass(String ConPass)
	{
		EnterConPassword.sendKeys(ConPass);
		return this;
	}
	 public HomePage clickRegButton()
	 {
		 ClickRegisterButton.click();
		 return new HomePage(driver);
	 }
	
	
	
	
	
	
	
}
