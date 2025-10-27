package mq.webdriver.Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Locating object and storing into reference variable
		WebElement Dob_month=driver.findElement(By.name("birthday_month"));
		
		
		/*
		 * Converting single selection dropdown into multiple selection dropdow
		 * Note:--> 
		 */
		((JavascriptExecutor)driver).executeScript
		("arguments[0].setAttribute('multiple','multiple')", Dob_month);
		Thread.sleep(4000);
		
		
		//Selecting Dropdown and storing into referrence variable
		Select monthSelection=new Select(Dob_month);
		
		
		//Checking dropdown selection is single or multiple type
		boolean flag=monthSelection.isMultiple();
		System.out.println("Dropdown multiple selection type is ---> "+flag);
		
		
		if(flag==true)
		{
			//Deselcting all options from multiple selection dropdown
			monthSelection.deselectAll();
			
			
			//First option to select
			monthSelection.selectByVisibleText("May");
			
			//second option to select
			Thread.sleep(2000);
			monthSelection.selectByVisibleText("Dec");
			
			//second option to select
			Thread.sleep(2000);
			monthSelection.selectByVisibleText("Jan");
			
			//Remove any option from selection
			Thread.sleep(2000);
			monthSelection.deselectByVisibleText("May");
		}
		else
		{
			System.out.println("dropdown is single option selection type");
		}

	}

}
