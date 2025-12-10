package waitcommands;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example_ExpectedConditions {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//First method
		String PageTitle=driver.getTitle();
		if(PageTitle.contains("Demo Web Shop"))
			System.out.println("title is presented");
		else
			System.out.println("Title is not presented");
		
		
		//Second method
		if(ExpectedConditions.titleContains("Demo Web Shop").apply(driver))
			System.out.println("title is presented");
		else
			System.out.println("Title is not presented");
		
		
		//Third method with Explicitwait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		boolean flag=wait.until(ExpectedConditions.titleContains("Demo Web Shop"));
		if(flag)
			System.out.println("title is presented");
		else
			System.out.println("Title is not presented");
		
	}

}
