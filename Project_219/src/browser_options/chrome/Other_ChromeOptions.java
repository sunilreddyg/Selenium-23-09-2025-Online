package browser_options.chrome;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Other_ChromeOptions {

	public static void main(String[] args) {
	
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		
		
		WebDriver driver=new ChromeDriver(options) ;   
		driver.get("https://facebook.com");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    System.out.println(driver.getTitle());
	    
	}

}
