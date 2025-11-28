package mq.java.ConditionalStatement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ELSE_IF_Example {

	public static void main(String[] args) {
		
		//Multiple Decisions take place here
		
		String br="edge";
		if (br.equals("chrome")) 
		{
			System.out.println("Chrome is up");
		} 
		else if (br.equals("firefox")) 
		{
			System.out.println("firefox is up");
		}
		else if(br.equals("edge"))
		{
			System.out.println("edge is up");
		}
		else 
		{
			System.out.println("No match found");
		}
		
		
		
		//Cross browser testing...
		String browser="firefox";
		WebDriver driver = null;
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("browser mismtatch");
		}
		
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		

	}

}
