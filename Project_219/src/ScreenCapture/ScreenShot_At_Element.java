package ScreenCapture;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_At_Element {

	public static void main(String[] args) throws Exception {
	
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://facebook.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	    //Captureing Screen at Selected Form
	    WebElement Form=driver.findElement(By.xpath("//form[contains(@data-testid,'royal_login_form')]"));
	    File src=Form.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(src, new File("screens\\registration1.png"));
	    
	    
	    //Capturing screen at selected element
	    WebElement Button=driver.findElement(By.xpath("//a[.='Create new account']"));
	    File src1=Button.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(src1, new File("screens\\button11.png"));
	    
	    
	    //Whole page to capture
	    WebElement page=driver.findElement(By.tagName("body"));   //Body represent page
	    File src2=page.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(src2, new File("screens\\page1.png"));
	}

}
