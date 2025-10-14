package mq.webdriver.launchbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		
		
		
		
		//Open Chrome browser
		ChromeDriver chrome=new ChromeDriver(); 
		
		//load new page into browser
		chrome.get("https://www.facebook.com/");
		
		//Fetch page title
		String pageTitle=chrome.getTitle();
		System.out.println(pageTitle);
		
		//Close browser
		chrome.quit();

	}

}
