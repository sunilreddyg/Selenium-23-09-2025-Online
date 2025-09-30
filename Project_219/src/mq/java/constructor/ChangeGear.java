package mq.java.constructor;

public class ChangeGear 
{

	//Class Constructor
	public ChangeGear() 
	{
		System.out.println("Holding Clutch");
	}

	
	//Instant method
	public void firstgear()
	{
		System.out.println("Change to First Gear");
	}
	
	//Instant method
	public void secondgear()
	{
		System.out.println("Change to Second Gear");
	}
	
	//static method  [Class method]
	public static void autogear()
	{
		System.out.println("Auto Gear active");
	}
	
	
	//Running method
	public static void main(String[] args) 
	{
		//Only running constructor
		//new ChangeGear();
		
		//Calling Instant method by creating object to class
		new ChangeGear().firstgear();
		new ChangeGear().secondgear();
		
		//Calling static method without object creation
		autogear();   //With in class
		ChangeGear.autogear();   //outside of the class

	}

}
