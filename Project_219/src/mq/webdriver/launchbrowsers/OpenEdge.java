package mq.webdriver.launchbrowsers;

import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdge 
{

	public static void main(String[] args) 
	{
		
		//Opening edge browser
		EdgeDriver edge=new EdgeDriver();
		
		
		//Loading new page to browser window
		edge.get("http://makemytrip.com");
		
		
		//printing current page title
		System.out.println(edge.getTitle());
		
		
		//Closing browser
		edge.quit();

	}

}
