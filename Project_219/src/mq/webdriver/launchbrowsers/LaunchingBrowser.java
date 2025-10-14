package mq.webdriver.launchbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class LaunchingBrowser {

	public static void main(String[] args) {
		
		
			/*
			 * Note:--> Webdriver support cross browser 
			 * 			automation and allow to automate
			 * 			tests on multiple browsers..
			 * 
			 * 			=> It is interface class and It is
			 * 				designed to manipulate all 
			 * 				broweser instances...
			 */
		
		
			WebDriver driver=new EdgeDriver();
			driver.get("http://facebook.com");
			System.out.println(driver.getTitle());
			driver.quit();
			
			
			

	}

}
