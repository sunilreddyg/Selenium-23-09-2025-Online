package mq.webdriver.Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Contains_VisibleText {

	public static void main(String[] args) {
		
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://testerbud.com/flight-booking-scenarios");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Selecting dropdown using Option name with partial characters
		WebElement From=driver.findElement(By.id("from"));
		new Select(From).selectByContainsVisibleText("Syd");
		
		//Selecting dropdown using full option name [Case sensitive]
		WebElement To=driver.findElement(By.id("to"));
		new Select(To).selectByVisibleText("Singapore");

	}

}
