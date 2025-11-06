package mq.webdriver.SwitchCommands.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/info/redcare");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//IDentifying frame
		WebElement frame1=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/iframe"));
		driver.switchTo().frame(frame1);
		
		
		//Identifying element under frame
		WebElement LoginHere=driver.findElement(By.xpath("//button[contains(.,'Login to your account')]"));
		LoginHere.click();
		
		
		//Identifying element under frame
		WebElement MobileNum=driver.findElement(By.xpath("//input[@class='inputFieldMobile   ']"));
		MobileNum.sendKeys("9030248855");
		
		//Get Controls back to page from frame
		driver.switchTo().defaultContent();
		

	}

}
