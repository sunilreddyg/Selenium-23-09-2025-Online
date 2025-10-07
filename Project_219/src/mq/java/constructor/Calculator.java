package mq.java.constructor;


public class Calculator 
{
	int a;
	int b;
	
	//Constructor with parameters
	public Calculator(int x, int y)
	{
		a=x;
		b=y;
	}
	
	void add()
	{
		System.out.println(a+b);
	}
	
	void mul()
	{
		System.out.println(a*b);
		System.out.println("");
	}

	public static void main(String[] args) 
	{
		Calculator obj1=new Calculator(10, 20);
		obj1.add();
		obj1.mul();
		
		Calculator obj2=new Calculator(5, 18);
		obj2.add();
		obj2.mul();
		
		

	}

}
