package mq.webdriver.list;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingItem_from_List {

	public static void main(String[] args) 
	{
		//Browser UP and loading webpage
		String URL="https://www.hdfc.bank.in/branch-locator";
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement StateDropdown=driver.findElement(By.xpath("//div[@id='branch-state']//div[@class='select-btn']"));
		StateDropdown.click();    //Click to open list of items
		
		WebElement State1=driver.findElement(By.xpath("//li[normalize-space()='Telangana']"));
		State1.click();		//Click to select one of item from list
			
		
		
		
		
		WebElement CityDropdown=driver.findElement(By.xpath("//div[@id='branch-city']//div[@class='select-btn']"));
		CityDropdown.click();
		
		WebElement Hydcity=driver.findElement(By.xpath("//li[contains(.,'Hyderabad')]"));
		Hydcity.click();
		
		
		/*
		   	Note:--> At Webpages most of listboxes look like
	  		dropdowns,Those listboxes we can select
	  		by using click method.
				
				=> selecting process for list boxes 		
				Step1:-->   First click to open list of items
				step2:--> 	Second click to select one of item from list.
		 */
		
		
		

	}

}
