package mq.webdriver.JavaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserActions_Methods {

	public static void main(String[] args) 
	{
		
		String url="https://demowebshop.tricentis.com/register";
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get(url);
	    driver.manage().window().maximize();
	    
	    
	    //Enable javascript executor on browser
	    JavascriptExecutor js=((JavascriptExecutor)driver);
	    
	    
	    //selecting Radiobutton/Checkbox using javascript
	    WebElement Checkbox=driver.findElement(By.xpath("//input[@id='gender-male']"));
	    js.executeScript("arguments[0].checked = true", Checkbox);
	   

	    //Typing text into entrybox/Textbox
	    WebElement Textbox=driver.findElement(By.xpath("//input[@name='FirstName']"));
	    js.executeScript("arguments[0].value='Sunil'", Textbox);
	    
	    //Clicking on button/link/Tab/checkbox/radiobutton
	    WebElement Clickable=driver.findElement(By.xpath("//input[@value='Register']"));
	    js.executeScript("arguments[0].click()", Clickable);
	    
	}

}
