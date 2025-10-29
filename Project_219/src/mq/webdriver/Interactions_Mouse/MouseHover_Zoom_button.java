package mq.webdriver.Interactions_Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Zoom_button {

	public static void main(String[] args) 
	{
		
		    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/other/User-Interaction-With-Key-Sequence-jQuery-keySequence.html");
		driver.manage().window().maximize();
		
		
		WebElement Element=driver.findElement(By.xpath("/html/body/div[4]/div[1]/section[1]/article[5]/figure/a"));
		new Actions(driver)
		.moveToElement(Element)
		.pause(2000)
		.click()
		.perform();
		
		
		

	}

}
