package mq.java.String;

public class StringBuilder_Example {

	public static void main(String[] args) {

		// String is imutable
		String name = "ArjunVishal";
		System.out.println("String is --> " + name);

		// String builder is mutable
		StringBuilder sb = new StringBuilder("SunilReddy");
		System.out.println("Initial StringBuilder: " + sb);

		// Append a string to the StringBuilder
		sb.append(" gajjala");
		System.out.println("After append: " + sb);

		
		//Reverse a string
		StringBuilder sb1 = new StringBuilder("webdriver");
		System.out.println(sb1.reverse().toString());
		
		
		
	}

}
