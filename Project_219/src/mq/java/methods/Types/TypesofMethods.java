package mq.java.methods.Types;

public class TypesofMethods 
{
	
	//void method
	void methodA()
	{
		String name="webdriver";
		System.out.println(name);
	}
	
	//String return method
	String methodB()
	{
		String tname="playwright";
		System.out.println(tname);
		return tname;
	}
	
	/*
	 * => Otherthan void all method types return value 
	 * => Otherthan void we should add return statement at end of the method
	 * => the return value should match with return type
	 * => Finally it return value to method name
	 */
	
	
	
	//Integer return method
	int methodC(int a, int b)
	{
		int c=a*b;
		return c;
	}
	
	
	//boolean return method
	boolean methodD(int age)
	{
		if (age >= 18) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	

	public static void main(String[] args) 
	{

		TypesofMethods obj=new TypesofMethods();
		obj.methodA();
		
		//Calling String return method
		String toolname=obj.methodB();
		System.out.println(toolname);
	
		//Calling int return
		int val=obj.methodC(10, 20);
		System.out.println(val+100);
		
		//Calling boolean return
		boolean flag=obj.methodD(21);
		System.out.println("Age Validation is --> "+flag);

	}

}
