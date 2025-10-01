package mq.java.methods;

public class SampleMethods 
{
	
	//Reusable method
	public void methodA() 
	{
		System.out.println("Method A called");
	}
	
	//Reusable method
	public void methodB() 
	{
		System.out.println("Method B called");
	}
	
	
	//Runner method
	public static void main(String[] args) 
	{
		//Running methods from class
		new SampleMethods().methodA();
		new SampleMethods().methodB();
		
		//Create object
		SampleMethods obj=new SampleMethods();
		obj.methodA();
		obj.methodB();
	}
	

}
