package mq.java.methods.parameters;

public class MultipleParameters 
{
	//Method with single parameters
	void method1(String name)
	{
		System.out.println(name);
	}
	
	
	//Method with multiple parameters
	void method2(String name,double price)
	{
		System.out.println(name+"   "+price);
	}
	
	//Method with multiple parameters
	void method3(String name,double price,boolean flag)
	{
		System.out.println(name+"   "+price+"    "+flag);
	}
	
	//Sequence parameters
	void method4(int a, int b)
	{
		System.out.println(a*b);
	}
	

	public static void main(String[] args) 
	{
		MultipleParameters par=new MultipleParameters();
		par.method1("Samsung"); //Calling with single argument
		
		par.method2("iphone", 65000);  		//Calling with double arguments
		par.method3("iphone", 65000,true);  //Calling with multiple arguments
		par.method4(10, 20);

	}

}
