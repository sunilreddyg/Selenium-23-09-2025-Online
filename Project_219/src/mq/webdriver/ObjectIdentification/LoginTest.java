package mq.webdriver.ObjectIdentification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) 
	{
		
		/*
		 * 1. Open Chrome Browser
		 * 2. Load Orange hrm demo login page
		 * 3. Type username 
		 * 4. Type password
		 * 5. Click Login button
		 */
		
		
		//Navigation Steps
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Identify username object and type text into editbox
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//Identify password object and type text into editbox
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//Identify login button and perform click.
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

		
	}

}
