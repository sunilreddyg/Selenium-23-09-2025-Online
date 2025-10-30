package mq.webdriver.JavaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScript_TypeText 
{

	public static void main(String[] args) 
	{
		
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    
	    
	    //Enbling javascript on automation browser
	    JavascriptExecutor js=((JavascriptExecutor)driver);
	    
	    //Type Username using Javascript Executor
	    js.executeScript("document.getElementById('email').value='Darshan'");
	    
	    //Type password using js-Executor
	    js.executeScript("document.querySelector('#pass').value='Google'");
	    
	    //Javascript Executor using xpath
	    WebElement LoginBtn= driver.findElement(By.xpath("//button[@data-testid='royal-login-button']"));
	    js.executeScript("arguments[0].click()", LoginBtn);
	}

}
