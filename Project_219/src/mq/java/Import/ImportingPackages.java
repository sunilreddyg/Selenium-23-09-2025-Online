package mq.java.Import;

import org.openqa.selenium.chrome.ChromeDriver;

import mq.java.Object.*;   //Entire package
import mq.java.methods.StaticMethods;  //Selected class imported

public class ImportingPackages 
{

	public static void main(String[] args) 
	{
		
		//Only public methods,variable can call outside packages
		OpenChrome obj=new OpenChrome();
		obj.loadpage();
		obj.userlogin();
		
		
		StaticMethods.methodA();
		StaticMethods.methodB();
		
		
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("https://google.com");
		
		
		
	}

}
