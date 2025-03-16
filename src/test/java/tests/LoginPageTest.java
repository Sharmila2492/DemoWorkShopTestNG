package tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import page.HomePage;

public class LoginPageTest extends ProjectSpecificationMethods {

	
		@BeforeTest
		public void setup() throws IOException {
			
			SheetName="LoginData";
			
		}
		@Test(dataProvider = "readData")  // Mandatory for the test to execute 
		public void loginTest(String email, String pass, String testType, String expectedText) throws IOException {
			
			HomePage obj = new HomePage(driver);
			obj.clickLogin()
			.enterEmail(email)
			.enterPass(pass)
			.clickLoginButton()
			.validLogin1(testType, expectedText);
			
		}

	

	

}
