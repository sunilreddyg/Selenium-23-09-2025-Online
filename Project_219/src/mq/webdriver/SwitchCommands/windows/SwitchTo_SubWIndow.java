package mq.webdriver.SwitchCommands.windows;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_SubWIndow {

	public static void main(String[] args) 
	{
		//Selenium3
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://facebook.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	    //Get Current Window ID
	    String MainWindowID=driver.getWindowHandle();
	    
	    
		WebElement Instalink=driver.findElement(By.linkText("Instagram"));
		Instalink.click();
		  
		  
		//Get All window Dynamic IDs
		Set<String> AllWindowIDS=driver.getWindowHandles();
		
		//Reading all window id's using foreach loop
		for (String eachwindowid : AllWindowIDS) 
		{
			driver.switchTo().window(eachwindowid);
		}
		  
		/*
		 * A small assumption when loop is completed by default you
		 * window controls will be on child window
		 */
		 System.out.println(driver.getTitle());
		 driver.close();    //Closing Sub window
		 
		 //Switch Back to Main Window
		 driver.switchTo().window(MainWindowID);
		 
		 System.out.println(driver.getTitle());

	}

}
