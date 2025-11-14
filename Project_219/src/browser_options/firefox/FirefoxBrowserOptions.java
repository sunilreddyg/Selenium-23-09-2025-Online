package browser_options.firefox;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxBrowserOptions {

	public static void main(String[] args) {
		
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");
		options.addArguments("--start-maximized");
		options.addPreference("dom.webnotifications.enabled", false);
		options.addPreference("geo.enabled", false);

		FirefoxDriver driver = new FirefoxDriver(options);
		driver.get("https://facebook.com");

	}

}
