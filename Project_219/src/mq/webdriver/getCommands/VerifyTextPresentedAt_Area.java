package mq.webdriver.getCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextPresentedAt_Area {

	public static void main(String[] args) {
	
		
		/*
		 * Testcase:-->
		 * 	Check required items presented at Categories
		 * 
		 *  Steps:-->
		 *  	1.Navigate to https://demowebshop.tricentis.com/
		 *  Output:-->
		 *  	Verify Books,Computers presented under categories 
		 * 
		 * 
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//Read current page title
		if(driver.getTitle().equals("Demo Web Shop"))
			System.out.println("Title is verified");
		else
			System.out.println("title is not verified");
		
		
		//Category location
		WebElement Category=driver.findElement(By.xpath("//div[@class='block block-category-navigation']//div[@class='listbox']"));
		String AllCategory=Category.getText();
		
		if(AllCategory.contains("Books") && AllCategory.contains("Computer"))
			System.out.println("Books and computers presented under categories");
		else
			System.out.println("books and computers not presented under categories");

	}

}
