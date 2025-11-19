package mq.java.String;

public class String_Methods {

	public static void main(String[] args) 
	{
		
		
		/*
		 * String:-->
		 * 			String store set of characters.String also called as class
		 * 			and string class contains set of methods to validate stored
		 * 			characters..
		 */
		
		
		/*
		 * Equals:-->
		 * 		Method verify expected characters sequences 
		 * 		matches with actual charecter sequences
		 * 		and boolean value true/false
		 * 
		 * 		Note:--> Comparision is casesensitive
		 */
		 String exptitle="Orange hRM";
		 String acttitle="Orange HRM";
		
		 boolean flag=acttitle.equals(exptitle);
		 System.out.println("equal comparision is:--> "+flag);
		 
		 
		 /*
		 * EqualIgnorecase:-->
		 * 			Method verify equal comparision by
		 * 			ignoring casesensitive
		 */
		 boolean flag1=acttitle.equalsIgnoreCase(exptitle);
		 System.out.println("EqualIgnorecase comparision is --> "+flag1);

		 
		 /*
		 * Contains:-->
		 * 		Method verify subsequent characters available
		 * 		with in main string and return boolean value.
		 */
		 String status="Account 100 Created";
		 System.out.println("Comparision1:--> "+status.contains("Account"));
		 System.out.println("Comparision2:--> "+status.contains("Account Created"));
		 System.out.println("Comparision3:--> "+status.contains("ted"));
		 System.out.println("Comparision4:--> "+status.contains("100"));


		 /*
		 * SubString:-->
		 * 		Method Get SubString characters from main String
		 */
		 String AccountNum="123455889874";
		 String LastDigits=AccountNum.substring(8);
		 System.out.println("last Digits are --> "+LastDigits);
		
		 String MiddleDigts=AccountNum.substring(4, 8);
		 System.out.println("Middle Digits are --> "+MiddleDigts);
		
		 String ProductPrice="$50000";
		 System.out.println(ProductPrice.substring(1));

		 
		 /*
		 * length:-->
		 * 		Method return number of characters count
		 * 		with in string 
		 */
		 String MobileNumber="9030248855";
		 int length=MobileNumber.length();
		 System.out.println("total length of characters is --> "+length);
		 
		 if(length == 10)
			 System.out.println("PASS");
		 else
			 System.out.println("FAIL");
		 
		 
		 /*
		 * Trim:-->
		 * 		Method trim extra characters available
		 * 		at string. Only trim left and right chacters
		 */
		String Pincode="   500075     ";
		System.out.println("Before Trim length is --> "+Pincode.length());
		int newpincode=Pincode.trim().length();
		System.out.println("After trim length is --> "+newpincode);
		 
		if(newpincode == 6)
			System.out.println("Valid PinCode");
		else
			System.out.println("Invalid Pincode");
		
		
		/*
		 * isEmpty:-->
		 * 		Method verify string empty status and return
		 * 		boolean value true/false
		 */
		String var1="";
		String var2="Hi";
		System.out.println("var1 empty status is ---> "+var1.isEmpty());
		System.out.println("Var2 empty status is ---> "+var2.isEmpty());


		/*
		 * startswith:-->
		 * 			Method verify given string started with expected characters
		 * 			and return boolean value
		 */
		String AccountNumber="111122227777";
		boolean flag5=AccountNumber.startsWith("11");
		System.out.println("Starts with Comparision is --> "+flag5);
		

		/*
		 * endswith:-->
		 * 			Method verify given string ends with expected characters
		 * 			and return boolean value
		 */
		boolean flag6=AccountNumber.endsWith("777");
		System.out.println("ends with Comparision is --> "+flag6);

		
		/*
		 * charsAt:-->
		 * 		Method return single character using index number
		 */
		String browsername="Chrome,Firefox";
		char ch=browsername.charAt(7);
		System.out.println("charcters available at Zero index number --> "+ch);

		/*
		 * ToLowerCase:-->
		 * 		method convert all Uppercase characters
		 * 		into lowercase
		 */
		String toolname="WebDriver";
		System.out.println(toolname.toLowerCase());
		
		
		/*
		 * toUppercase:-->
		 * 		method convert all lowercase characters 
		 * 		into uppercase
		 */
		System.out.println(toolname.toUpperCase());
		
		
		/*
		 * concat:-->
		 * 			Method club two string 
		 */
		String firstname="SunilReddy";
		String surname="gajjala";

		
		//This Works only for two strings
		String fullname=firstname.concat(surname);
		System.out.println(fullname);
		
		//It works for all dataypes to Concat
		System.out.println(firstname+surname);
		
		
		/*
		 * replace:-->
		 * 		Replace old characters with New characters 
		 */
		String Price="$10,000";
		String NewPrice=Price.replace("$", "").replace(",", "");
		System.out.println(NewPrice);
		
		int val=Integer.parseInt(NewPrice);
		System.out.println(val==10000);  //Double equals only compare two numeric values
		
		
		//Replace All
		System.out.println(Price.replaceAll("0", "1"));
				
		//Print only numeric characters with in String using Regular expression
		String str="sdfvsdf68fsdfsf8999fsdf09";
		String numberOnly= str.replaceAll("[^0-9]", "");
		System.out.println(numberOnly);

		 
		//Example 
		String Info="Account 100 created";
		String ID= Info.replaceAll("[^0-9]", "");
		System.out.println(ID);
		
		//Print only characters
		System.out.println(Info.replaceAll("[^a-z]", ""));

	}

}
