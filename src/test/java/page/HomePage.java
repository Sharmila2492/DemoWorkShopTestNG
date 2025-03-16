package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


import base.ProjectSpecificationMethods;

public class HomePage extends ProjectSpecificationMethods {
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="(//a[@class='account'])[1]")
	WebElement validLoginText;
	
	@FindBy(xpath="//span[@for='Email']")
	WebElement invalidLoginText;
    
	
	 public RegisterPage clickRegister()
	    {
	    	driver.findElement(By.className("ico-register")).click();
	    	
	    	return new RegisterPage();
	    }
		
	 public LoginPage clickLogin()
		{
			//clicklogin.click();
			driver.findElement(By.className("ico-login")).click();
			
			return new LoginPage(driver);
		}
	 public HomePage validLogin1(String TestType, String ExpectedResult) {
			
			if(TestType.equalsIgnoreCase("ValidEmailValidPassword")){
				
				String ActualText=validLoginText.getText();
				//Hard Assertion
				Assert.assertEquals(ActualText, ExpectedResult);
			} else if(TestType.equalsIgnoreCase("InValidEmailValidPassword")){
				
				String ActualText=invalidLoginText.getText();
				// Soft Assertion
				SoftAssert asserObj = new SoftAssert();
				asserObj.assertEquals(ActualText, ExpectedResult);
				asserObj.assertAll();
			}
			return this;
	 }

}
