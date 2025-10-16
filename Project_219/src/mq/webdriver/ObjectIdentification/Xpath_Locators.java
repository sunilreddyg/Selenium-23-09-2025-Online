package mq.webdriver.ObjectIdentification;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locators 
{
	
	public static void main(String[] args) 
	{
		

		/*
		 * 1. Open Chrome Browser
		 * 2. Load Orange hrm demo login page
		 * 3. maximize browser window  [Optional]
		 * 4. Identify Firstname object and Type characters init
		 * 5. Click Login button
		 */
		
		//Open Browser and Loadin gpage
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Manage browser settings [Maximize and Implicit time]
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Darshan");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Hello@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		System.out.println("Login Details submitted");
		
		
	}

}
