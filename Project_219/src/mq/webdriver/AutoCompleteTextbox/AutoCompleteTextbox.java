package mq.webdriver.AutoCompleteTextbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.WebElementToJsonConverter;

public class AutoCompleteTextbox {

	public static void main(String[] args) throws Exception 
	{
		
		
		//Browser UP and loading webpage
		String URL="https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Entering login details
		driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.cssSelector(".oxd-button")).click();
	    
	    //Clicking on admin tab
	    driver.findElement(By.cssSelector(".oxd-main-menu-item-wrapper:nth-child(1) .oxd-text")).click();
	    
	    //Typing reference text into Editbox
	    WebElement EmpNameEntry=driver.findElement(By.cssSelector(".oxd-autocomplete-text-input > input"));
	    EmpNameEntry.sendKeys("Travon Cameron Lakin");
	    
	    Thread.sleep(2000);  //To load Sugesstions
	    WebElement Emp1=driver.findElement(By.xpath("//span[contains(.,'Travon Cameron Lakin')]"));
	    Emp1.click(); //Clicking one of item from sugession list
	}

}
