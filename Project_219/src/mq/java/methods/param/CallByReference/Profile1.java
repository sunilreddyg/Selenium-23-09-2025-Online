package mq.java.methods.param.CallByReference;

public class Profile1 
{
	
	String name;
	
	void getDetails(String fname)
	{
		name=fname;
		System.out.println(name+"  Details Captured");
	}

}
