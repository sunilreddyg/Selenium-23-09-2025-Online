package mq.webdriver.Datepicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Date_From_Calendar {

	public static void main(String[] args) {
		
		
		//Browser UP and loading webpage
		String URL="https://jqueryui.com/resources/demos/datepicker/default.html";
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement Textbox=driver.findElement(By.xpath("//input[@id='datepicker']"));
		Textbox.click();  //Opening calendar
		
		WebElement Date=driver.findElement(By.xpath("//a[@data-date='22']"));
		Date.click();     //Selecting date from calendar

	}

}
