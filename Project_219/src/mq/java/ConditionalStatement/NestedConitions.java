package mq.java.ConditionalStatement;

public class NestedConitions {

	public static void main(String[] args) {
		
		//First Decision
		int age=20;
		if(age > 18)
		{
			System.out.println("valid age");
			
			//Decision inside decision
			String name="sunil";
			if(name.equals("sunil"))
			{
				System.out.println("valid user");
				int num=2;
				//Switch Inside decision
				switch (num) {
				case 1:
					System.out.println("Here for registration");
					break;
				
				case 2:
					System.out.println("Here for forward application");
					boolean appstatus=true;
					//Inside switch decision
					if(appstatus==true)
					{
						System.out.println("No Issues to forward application");
					}
					break;
				default:
					break;
				}
			}
			else
			{
				System.out.println("invalid user");
			}
			
		}
		
		

	}

}
