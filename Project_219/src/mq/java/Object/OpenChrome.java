package mq.java.Object;

public class OpenChrome 
{
	
	public OpenChrome() 
	{
		System.out.println("Chrome is up");
	}
	
	public void loadpage()
	{
		System.out.println("Facebook page load");
	}
	
	public void userlogin()
	{
		System.out.println("Login entry completed");
	}
	
	public static void main(String[] args) 
	{
		
		//new OpenChrome().loadpage();
		//new OpenChrome().userlogin();
		
		//Create object to class
		OpenChrome obj=new OpenChrome();
		obj.loadpage();
		obj.userlogin();
		System.out.println(obj);
		
		/*
		 * Object Creation syntax
		 * 		
		 * 		Classname obj=new Classanme();
		 * 		obj.methodname();
		 * 		
		 */
		OpenChrome ref=new OpenChrome();
		ref.loadpage();
		ref.userlogin();
		System.out.println(ref);
		
		
	}
}
