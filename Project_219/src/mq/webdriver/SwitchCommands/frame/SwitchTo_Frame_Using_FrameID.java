package mq.webdriver.SwitchCommands.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_FrameID {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://demo.automationtesting.in/Frames.html");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	    //Switching to frame using id property
	    driver.switchTo().frame("singleframe");
	    
	    
	    //Frame Element
	    WebElement Entry=driver.findElement(By.xpath("//input[@type='text']"));
	    Entry.sendKeys("9030248855");

	    //Switch controls back to page
	    driver.switchTo().defaultContent();

	}

}
