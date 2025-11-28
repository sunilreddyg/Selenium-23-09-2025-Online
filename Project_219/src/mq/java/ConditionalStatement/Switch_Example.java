package mq.java.ConditionalStatement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import mq.java.methods.StaticMethods;

public class Switch_Example {

	public static void main(String[] args) {
		
		
		/*
		 * Switch works like elseif statement only. The only
		 * difference switch command switch to only required
		 * case instaed of checking every condition...
		 */
		
		
		String day="thu";
		switch (day) 
		{
		case "mon":
			System.out.println("monday");
			break;
			
		case "tue":
			System.out.println("tuesday");
			break;
			
		case "sat":
			System.out.println("saturday");
			break;

		case "thu": 
			System.out.println("thursday");
			break;

		default:
			System.out.println("day mismatch");
			break;
		}
		
		
		
		
		
		//cross browser testing
		String browser="firefox";
		WebDriver driver=null;
		
		switch (browser) {
		case "chrome":
			driver=new ChromeDriver();
			System.out.println("Chrome is up and ready to use");
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			System.out.println("firefox is up and ready to use");
			break;

		default:System.out.println("browser mismatch");
			break;
		}
		
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}
