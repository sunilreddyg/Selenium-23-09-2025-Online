package mq.java.methods.param.CallByReference;


public class TestProfile1 
{
	Profile1 pf;
	
	public TestProfile1(Profile1 pf1) 
	{
		pf=pf1;
	}
	
	public void getprofile1()
	{
		pf.getDetails("Sunil");
	}
	
	
	public static void main(String[] args) 
	{
		Profile1 obj1=new Profile1();  
		System.out.println(obj1);
		
		
		TestProfile1 tp1=new TestProfile1(obj1);
		tp1.getprofile1();
		
		
	}

}
