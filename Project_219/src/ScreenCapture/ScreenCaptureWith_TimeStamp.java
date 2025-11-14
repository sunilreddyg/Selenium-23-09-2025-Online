package ScreenCapture;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenCaptureWith_TimeStamp {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://facebook.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	    //Time stamp using java
	    Date d=new Date();
	    //Creating simple formatter
	    DateFormat sdf=new SimpleDateFormat("yyyy MMM EEE dd hh-mm-ss");
	    String time=sdf.format(d);
	    System.out.println(time);
	    
	    //Captureing Screen at Selected Form
	    WebElement Form=driver.findElement(By.xpath("//form[contains(@data-testid,'royal_login_form')]"));
	    File src=Form.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(src, new File("screens\\registration2"+time+".png"));
	    
	    
	    
	}

}
