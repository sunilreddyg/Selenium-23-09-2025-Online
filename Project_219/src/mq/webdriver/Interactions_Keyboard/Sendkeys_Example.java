package mq.webdriver.Interactions_Keyboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_Example {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		/*
		 * 1. User search "Buld your own Computer"  at Textbox
		 * 2. From sugession list user press ArrowDown using keybord
		 * 3. User Presss Enter to Select one of suggession list
		 */
		WebElement SearchCombo=driver.findElement(By.xpath("//input[@value='Search store']"));
		new Actions(driver)
		.sendKeys(SearchCombo, "Build your own computer")
		.pause(2000)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.perform();
		
		
		/*
		 * 1.User click on RAM Dropdown, It gives list of items
		 * 2.User press Arrow down keys twice with interval timeout
		 * 3.User press Enter keybord to finish selection..
		 */
		WebElement RAM=driver.findElement(By.xpath("//select[@id='product_attribute_16_6_5']"));
		new Actions(driver)
		.click(RAM)
		.pause(2000)
		.sendKeys(Keys.ARROW_DOWN)
		.pause(1000)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.perform();
		
		/*
		 * 1.User click on Quantity Editbox
		 * 2.User press BackSpace at Keyboard
		 * 3.User type new value at editbox
		 * 
		 */
		WebElement Quantity=driver.findElement(By.xpath("//input[@value='1']"));
		new Actions(driver)
		.click(Quantity)
		.pause(1000)
		.sendKeys(Keys.BACK_SPACE)
		.pause(1000)
		.sendKeys("2")
		.perform();
		
		
		//Keyboard short cuts
		new Actions(driver).sendKeys(Keys.ESCAPE).perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		
	}

}
