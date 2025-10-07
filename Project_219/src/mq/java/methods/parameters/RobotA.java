package mq.java.methods.parameters;

public class RobotA 
{
	
	
	void walk(String Area)
	{
		if(Area.equals("p1"))
		{
			System.out.println("Walking at p1");
		}
		else if(Area.equals("p2"))
		{
			System.out.println("Walking at p2");
		}
		else if(Area.equals("p3"))
		{
			System.out.println("Walking at p3");
		}
	}
	
	
	

	public static void main(String[] args) {
		
			RobotA robot=new RobotA();
			robot.walk("p3");

	}

}
