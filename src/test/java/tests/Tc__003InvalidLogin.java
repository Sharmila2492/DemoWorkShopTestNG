package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import page.HomePage;

public class Tc__003InvalidLogin extends ProjectSpecificationMethods{
	
	@BeforeTest
	public void setup()
	{
		SheetName="LoginData";
	}
	@Test(dataProvider="readData")
	public void InvalidLoginTest(String email, String pass, String testType, String expectedText)
	{
		
	HomePage Inv=new HomePage(driver);
	 Inv.clickLogin()
	    .enterEmail(email)
	    .enterPass(pass)
	    .clickLoginButton()
	    .validLogin1(testType, expectedText);
	
	}
}
