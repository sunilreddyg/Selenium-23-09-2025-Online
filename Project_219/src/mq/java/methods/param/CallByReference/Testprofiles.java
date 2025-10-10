package mq.java.methods.param.CallByReference;

public class Testprofiles 
{
	
	
	void getprofile(Profile1 pf)
	{
		
		pf.getDetails("Aakash");
		System.out.println(pf.name);
	}
	

	public static void main(String[] args) 
	{
		Testprofiles tp=new Testprofiles();
		tp.getprofile(new Profile1());
	}

}
