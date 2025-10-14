package mq.webdriver.launchbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox{

	public static void main(String[] args)
	{
		
		//Opening firefox browser
		FirefoxDriver firefox=new FirefoxDriver();
		//Using browser reference loading webpage
		firefox.get("https://google.com");
		
		
		//Fetch page title into String
		String pagetitle=firefox.getTitle();
		System.out.println(pagetitle);
		
		
		//Close browser
		firefox.quit();

		
	}

}
