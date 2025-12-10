package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_WaitforTheTitle {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		System.out.println("browser is launched");
		
		
		
		
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.titleIs("Demo Web Shop"));
			System.out.println("Page title is verified");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		WebElement Register=driver.findElement(By.linkText("Register"));
		Register.click();
		
		
		
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.urlContains("/register"));
			System.out.println("Page url is verified");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
