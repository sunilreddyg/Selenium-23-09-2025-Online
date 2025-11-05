package mq.webdriver.SwitchCommands.alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertActions 
{
	
	
	
	WebDriver driver;
	public AlertActions(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	//Reusable method to close alert
	public void acceptAlert()
	{
		try {
			driver.switchTo().alert().accept();
			System.out.println("Pressed ok button at alert");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Reusable method for wait for alert...
	public Alert waitForAlert(long timeoutInSeconds) 
	{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds)); // For Selenium 4+
        wait.until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert();
    }
	
	
	

}
