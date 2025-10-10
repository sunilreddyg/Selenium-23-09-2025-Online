package mq.java.methods.Types;

public class Runner {

	public static void main(String[] args) {
		
		
		
		GetInfo obj=new GetInfo();

		
		obj.getfirststudent().Issue().MainCertifcate();
		obj.getsecondstudent().Issue().MainCertifcate();
		
		//Using variable referrences
		Student1 std1=obj.getfirststudent();
		Certificate cft=std1.Issue();
		cft.MainCertifcate();
	}

}
