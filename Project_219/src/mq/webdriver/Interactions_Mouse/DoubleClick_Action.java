package mq.webdriver.Interactions_Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Action {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://qa-practice.netlify.app/double-click");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement Element=driver.findElement(By.xpath("//button[contains(.,'Double click me')]"));
		Actions action=new Actions(driver);
		
		action.doubleClick(Element).perform();
		
		
	}

}
