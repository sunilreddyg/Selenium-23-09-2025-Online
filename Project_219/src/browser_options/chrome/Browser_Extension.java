package browser_options.chrome;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser_Extension {

	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.setImplicitWaitTimeout(Duration.ofSeconds(30));
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		
		
		Map<String, Object> prefs = new HashMap<>();
        prefs.put("homepage", "https://www.facebook.com"); // Replace with your desired welcome page URL
        prefs.put("profile.default_content_settings.popups", 0); // Optional: disable popups

        // Add the preferences to ChromeOptions
        options.setExperimentalOption("prefs", prefs);
		
		
		WebDriver driver=new ChromeDriver(options) ;   
	    System.out.println(driver.getTitle());

	}

}
