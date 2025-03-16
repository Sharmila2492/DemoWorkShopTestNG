package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethods;

public class RegisterResult2 extends ProjectSpecificationMethods {
	public RegisterResult2(WebDriver driver) {
		this.driver=driver;
	}
	
	public RegisterResult2 validateRegister(String actualText, String expectedText) {
		
		 actualText = driver.findElement(By.className("result")).getText();
		 expectedText="Your registration completed";
		
		if(actualText.contains(expectedText)) {
			
			System.out.println("Registeration Sucessful");
		} else {
			
			System.out.println("Unsucessful");
		}
		 return this;		
	}
	
	public HomePage clickContinue() {
		
		driver.findElement(By.xpath("//input[contains(@class,'register-continue-button')]")).click();
		return new HomePage(driver);
	}
}


