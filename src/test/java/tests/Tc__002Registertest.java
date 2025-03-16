package tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import page.HomePage;

public class Tc__002Registertest extends ProjectSpecificationMethods{

	
	@BeforeTest
	public void setup() throws IOException {
		
		SheetName="RegisterData";
		
	}
	@Test(dataProvider = "readData")  // Mandatory for the test to execute 
	public void RegisterTest(String Fname, String Lname, String email, String pass,String ConPass, String actualText,String expectedText) {
		
		HomePage reg=new HomePage(driver);
		
	    reg.clickRegister()
	        .clickGender()
	        .enterFirstName(Fname)
	        .enterLastName(Lname)
	        .enterEmail(email)
	        .enterPass(pass)
	        .enterConPass(ConPass)
	        .clickRegButton();
	        
	      
	        
	        
	      
	}
}
