package mq.webdriver.Interactions_Keyboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClearText_From_Editbox {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Direct selenium method to clear text from editbox
		WebElement Firstname=driver.findElement(By.id("FirstName"));
		Firstname.sendKeys("sunil");
		Firstname.clear();
		
		//Using Keyboard shortcut clearing text from editbox
		WebElement Lastname=driver.findElement(By.id("LastName"));
		Lastname.sendKeys("Reddy");
		new Actions(driver)
		.click(Lastname)
		.pause(1000)
		.keyDown(Keys.CONTROL)
		.sendKeys("A")
		.sendKeys(Keys.BACK_SPACE)
		.perform();
		

	}

}
