package mq.java.Variables.Types;

public class LocalVariable 
{
	
	
	public void methodA()
	{
		String name="webdriver";       //local variable
		System.out.println(name);
	}
	
	public void methodB()
	{
		String mobie="9030248855";		 //local variable
		System.out.println(mobie.length());
	}
	
	

	public static void main(String[] args) 
	{
			
			String tname=new GlobalVariable().name;
			System.out.println(tname);
			
			double tprice=new GlobalVariable().price;
			System.out.println(tprice);
		
	}

}
