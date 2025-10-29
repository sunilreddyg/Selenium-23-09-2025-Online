package mq.webdriver.Interactions_Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement_MouseHover {

	public static void main(String[] args) {
		
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Hovering on location
		WebElement Computers=driver.findElement(By.xpath("(//a[@href='/computers'])[1]"));
		new Actions(driver).moveToElement(Computers).perform();
		
		//Using left click on location
		WebElement Sub_Desktop=driver.findElement(By.xpath("(//a[@href='/desktops'])[1]"));
		//Sub_Desktop.click();
		new Actions(driver).click(Sub_Desktop).perform();
		
		
		WebElement Electronics=driver.findElement(By.xpath("(//a[@href='/electronics'])[1]"));
		WebElement CellPhones=driver.findElement(By.xpath("(//a[contains(.,'Cell phones')])[1]"));
		
		
		//Creating object for Actions class
		Actions action=new Actions(driver);
		action
		.moveToElement(Electronics)
		.pause(4000)
		.click(CellPhones)
		.perform();
		
	}

}
