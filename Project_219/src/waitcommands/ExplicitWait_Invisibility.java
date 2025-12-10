package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Invisibility {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		
		By register=By.linkText("Register");
		
		//wait until object is invisible
		
		boolean flag = false;
		try {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			flag=wait.until(ExpectedConditions.invisibilityOfElementLocated(register));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Object Visibility status:-->"+ flag);

	}

}
