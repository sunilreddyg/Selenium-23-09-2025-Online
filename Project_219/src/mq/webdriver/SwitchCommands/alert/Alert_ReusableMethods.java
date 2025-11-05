package mq.webdriver.SwitchCommands.alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_ReusableMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://tgepass.cgg.gov.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    //This button make alert display at webpage
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@value='Login']"));
	    Alert_prompt_link.click();
	   
	    
	    AlertActions alerts=new AlertActions(driver);
	    alerts.waitForAlert(30).accept();
	    
	    

	}

}
