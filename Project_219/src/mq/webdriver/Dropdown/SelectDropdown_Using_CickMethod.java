package mq.webdriver.Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SelectDropdown_Using_CickMethod {

	public static void main(String[] args) {
		
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://testerbud.com/flight-booking-scenarios");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		/*
		 * Step1:--> Find a select tag element
		 * Step2:--> Find option tag under select tag and Press Cick method
		 */
		WebElement From=driver.findElement(By.id("from"));
		From.findElement(By.xpath("//*[@id='from']/option[7]")).click();
	}

}
