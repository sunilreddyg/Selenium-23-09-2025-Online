package mq.webdriver.getCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_Commands {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//Read current page title
		String RuntimeTitle=driver.getTitle();
		System.out.println(RuntimeTitle);
		
		String ExpTitle="Demo Web Shop";
		
		if (RuntimeTitle.equals(ExpTitle)) 
		{
			System.out.println("Homepage title is verified");
		} 
		else 
		{
			System.out.println("Homepage title is not verified");
		}
		
		
		//Navigate to New page
		WebElement Register=driver.findElement(By.linkText("Register"));
		Register.click();
		
		//Read Current page url
		String RuntimeUrl=driver.getCurrentUrl();
		
		if(RuntimeUrl.startsWith("https://"))
		{
			System.out.println("Domain is secured");
		}
		else
		{
			System.out.println("Domain is unsecured");
		}
		
		
		//Checking required text presented at url
		if(RuntimeUrl.contains("register"))
			System.out.println("Expected url presented");
		else
			System.out.println("Expected url not presented");
		
		
		//Read Current pagesource
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		
		
		//Checking required text presented at source
		if(PageSource.contains("Shopping cart"))
			System.out.println("text presented at Source");
		else
			System.out.println("text not presented at source");
		
		/*
		 * What else we can verify at pagesource
		 * 	1. Can Verify title of the page
		 *  2. Can verify url of the page
		 *  3. Can verify any element presented at source [Idproperty/Name property]
		 *  4. Can verify text presented at page
		 */

	}

}
