package mq.webdriver.SwitchCommands.windows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		
		
		//Selenium3
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://facebook.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	    //Get Current Window ID
	    String MainWindowID=driver.getWindowHandle();
	    
	    
	    //This link opens in new window
		WebElement Instalink=driver.findElement(By.linkText("Instagram"));
		Instalink.click();
		
		//This link opens in new window
		WebElement Metapay=driver.findElement(By.linkText("Meta Pay"));
		Metapay.click();
		
		//THis link opens in new window
		WebElement Metastore=driver.findElement(By.linkText("Meta Store"));
		Metastore.click();
		
		
		//Get Allwindow ID's
		Set<String> allwindowids=driver.getWindowHandles();
		//switch to all windows using foreach loop
		for (String eachwindowid : allwindowids)
		{
			String EachTitle=driver.switchTo().window(eachwindowid).getTitle();
			if(EachTitle.contains("Meta Pay | Meta"))
			{
				break;  //Break loop
			}
		}
		
		
		System.out.println(driver.getTitle());
		
		
		/*
		 * Here is the assumption when when title matches break statement jump out of iterations.
		 * Where it break iteration consider in same window controls are preseted.
		 */
		
		
		
		
		

	}

}
