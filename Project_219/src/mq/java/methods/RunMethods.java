package mq.java.methods;

public class RunMethods 
{
	//Instant method
	public void method1() 
	{
		System.out.println("Method 1 called");
	}
	
	
	//Static method
	public static void method2() 
	{
		System.out.println("Method 2 called");
	}
	
	//Runner method
	public static void main(String[] args) 
	{
		
		//Calling static method
		RunMethods.method2();
		
		//Calling instant method
		new RunMethods().method1();
		
	}

}
