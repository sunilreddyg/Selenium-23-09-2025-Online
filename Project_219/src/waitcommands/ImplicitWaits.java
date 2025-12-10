package waitcommands;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaits {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//Wait required objects to load DOM[Document object model]
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Wait until all pageobject to load [By Default selenium wait for page to load]
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		//Wait until scripts to load 
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20))
		.pageLoadTimeout(Duration.ofSeconds(100)).scriptTimeout(Duration.ofSeconds(50));

	}

}
