package mq.webdriver.getCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadText_From_Element {

	public static void main(String[] args) 
	{

		/*
		 * Testcase:--> Check Error presented when use attempt with empty data
		 * 
		 * User Steps:
		 * 		1. Navigate to https://demowebshop.tricentis.com/
		 * 		2. Click on Register link
		 * 		3. Submit Registration button without any data entry
		 * 
		 * System Response:
		 * 	
		 * 		Display error text at page for every mandatory field
		 * 		
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//Read current page title
		if(driver.getTitle().equals("Demo Web Shop"))
			System.out.println("Title is verified");
		else
			System.out.println("title is not verified");
		
		
		//Navigate to New page
		WebElement Register=driver.findElement(By.linkText("Register"));
		Register.click();
		
		//Identifying object
		WebElement RegisterButton=driver.findElement(By.id("register-button"));
		RegisterButton.click();  
		
		//Locating error element
		WebElement FirstnameErrorLoc=driver.findElement(By.xpath("//span[@for='FirstName']"));
		String FnameError=FirstnameErrorLoc.getText();
		
		if(FnameError.equals("First name is required."))
			System.out.println("As Expected error presented for firstname");
		else
			System.out.println("Error not presented for firsntname");
		
		//Lastname error location
		WebElement lastnameErrorLoc=driver.findElement(By.xpath("//span[@for='LastName']"));
		String LnameError=lastnameErrorLoc.getText();
		if(LnameError.equals("Last name is required."))
			System.out.println("As Expected error presented for Lastname");
		else
			System.out.println("Error not presented for Lastname");

	}

}
