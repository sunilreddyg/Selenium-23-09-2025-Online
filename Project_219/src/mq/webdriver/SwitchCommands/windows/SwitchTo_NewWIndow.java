package mq.webdriver.SwitchCommands.windows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_NewWIndow {

	public static void main(String[] args) {
		
		//selenium 4
		
			WebDriver driver=new ChromeDriver();     //Launching browser method
			driver.get("https://facebook.com");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		    System.out.println(driver.getTitle());
		    
		    //Get Current window handler
		    String FBWID=driver.getWindowHandle();
		    System.out.println(FBWID);
		    
			/*
			 * WebElement Instalink=driver.findElement(By.linkText("Instagram"));
			 * Instalink.click();
			 */
		    
		    WebDriver insta=driver.switchTo().newWindow(WindowType.WINDOW);
		    insta.get("https://www.instagram.com/");
		    System.out.println(insta.getTitle());
		    

		    //Get Current window handler
		    String INSTWID=driver.getWindowHandle();
		    System.out.println(INSTWID);
		    
		   
		    //Typing in instagram page
		    insta.findElement(By.name("username")).sendKeys("sunil@gmail.com");
		    
		    //From the sub window Switch to Mainwindow
		    insta.switchTo().window(FBWID);
		    
		    //Typing in facebook page
		    driver.findElement(By.id("email")).sendKeys("darshan@gmail.com");
		    
		    //Switch to Subwindow from main window
		    driver.switchTo().window(INSTWID);
		    
		    System.out.println(insta.getTitle());


	}

}
