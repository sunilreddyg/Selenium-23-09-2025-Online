package ScreenCapture;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShot {

	public static void main(String[] args) throws Exception 
	{
		
		

		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://facebook.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    //Capturing Screen and Converting into file format
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	    //Creating Folder in Project
	    FileHandler.createDir(new File("screens"));
	    
	    //Save image into local system
	    FileHandler.copy(src, new File("screens\\image1.png"));
	    
	    
	    
	    /*
	     * PNG:--> Image extension Portable Network Graphic
	     * 
	     */

	}

}
