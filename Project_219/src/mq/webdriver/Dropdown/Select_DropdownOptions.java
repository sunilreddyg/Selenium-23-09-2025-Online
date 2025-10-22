package mq.webdriver.Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_DropdownOptions {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new EdgeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Selecting dropdown option using visible text
		WebElement DOB_Day=driver.findElement(By.id("day"));
		new Select(DOB_Day).selectByVisibleText("14");
		
		
		//Selecting dropdown option using value property
		WebElement DOB_Month=driver.findElement(By.name("birthday_month"));
		new Select(DOB_Month).selectByValue("9");
		
		//selecting dropdown using index number
		WebElement DOB_year=driver.findElement(By.name("birthday_year"));
		new Select(DOB_year).selectByIndex(5);
		
		
		
		
		

	}

}
