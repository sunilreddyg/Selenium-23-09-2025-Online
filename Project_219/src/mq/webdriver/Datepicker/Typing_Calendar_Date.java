package mq.webdriver.Datepicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Typing_Calendar_Date {

	public static void main(String[] args) {
		
		
		//Browser UP and loading webpage
		String URL="https://jqueryui.com/resources/demos/datepicker/default.html";
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				
		/*
		 * Note:-->
		 * 		When calendar textbox is in writable mode so that we can type
		 * 		date directly instead of selecting...
		 */
		WebElement Textbox=driver.findElement(By.xpath("//input[@id='datepicker']"));
		Textbox.sendKeys("10/22/2026",Keys.ESCAPE);

	}

}
