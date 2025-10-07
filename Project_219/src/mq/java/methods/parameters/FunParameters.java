package mq.java.methods.parameters;

public class FunParameters 
{
	//Method without parameter
	void method1()
	{
		System.out.println("fixed value");
	}
	
	//Method with string parameter
	void method2(String name)
	{
		System.out.println(name);
	}
	
	//Method with string parameter
	void method3(int quantity)
	{
		System.out.println(quantity);
	}
	
	//Method with boolean parameter
	void method4(boolean flag)
	{
		System.out.println(flag);
	}
	
	//Method with double parameter
	void method5(double price)
	{
		System.out.println(price);
	}
	
	//Method with char parameter
	void method6(char group)
	{
		System.out.println(group);
	}
	

	public static void main(String[] args) 
	{
		FunParameters obj=new FunParameters();
		obj.method1(); //Calling method without argument
		
		//Calling method with String argument
		obj.method2("Samsung"); 
		
		//Calling method with integer argument
		obj.method3(1);
		
		//Calling method with boolean argument
		obj.method4(false);
		
		//Calling method with double argument
		obj.method5(122.33);
		
		//Calling method with char argument
		obj.method6('A');

	}

}
