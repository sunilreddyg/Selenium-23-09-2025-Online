package mq.java.methods;

public class StaticMethods 
{

	//Reusable static method
	public static void methodA() 
	{
		System.out.println("MethodA called");
	}
	
	
	//Reusable static method
	public static void methodB() 
	{
		System.out.println("MethodB called");
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		StaticMethods.methodA();
		StaticMethods.methodB();
		
	}

}
