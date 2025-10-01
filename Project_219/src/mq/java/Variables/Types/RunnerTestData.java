package mq.java.Variables.Types;

public class RunnerTestData {

	public static void main(String[] args) 
	{
		//Calling static  Variables
		String username=TestData.uid;
		System.out.println(username);
		
		System.out.println(TestData.pwd);
		System.out.println(TestData.url);
		
		
		//Create object to class
		GlobalVariable obj=new GlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.price);

	}

}
