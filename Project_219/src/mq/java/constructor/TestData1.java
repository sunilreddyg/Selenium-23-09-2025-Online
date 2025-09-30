package mq.java.constructor;

public class TestData1 
{
	//Variable Instant type
	String name="Sunil"; 
	int age=35;
	
	//variable static type
	static String name1="Ashu";
	static int age1=23;
	
	
	//Constructor
	public TestData1() 
	{
		System.out.println("Running Con:");
	}
	

	public static void main(String[] args) 
	{
		//Calling instant variable
		System.out.println(new TestData1().name);
		System.out.println(new TestData1().age);
		
		//Calling static variables
		System.out.println(TestData1.name1);
		System.out.println(TestData1.age1);

	}

}
