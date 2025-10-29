package mq.webdriver.Interactions_Mouse;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_DropBy_Target 
{

	public static void main(String[] args) throws Exception {
		
		    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(8000);
		
		WebElement ScrollButton1=driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[1]"));
		WebElement ScrollButton2=driver.findElement(By.xpath("(//div[contains(@class,'rangeslider__handle')])[2]"));
		
		//Scroll Object to Required location using x and y coordinates
		Actions action=new Actions(driver);
		
		action.dragAndDropBy(ScrollButton1, 200, 0).perform();
		action.dragAndDropBy(ScrollButton2, -100, 0).perform();
	}

}
