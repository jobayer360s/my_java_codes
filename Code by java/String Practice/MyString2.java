import java.lang.*;

public class MyString2{
	
	public static void main(String[] args)
	{
		String s1  = new String("Jobayer");
		System.out.println(s1); //Jobayer
		String s2 = "Jakia";
		System.out.println(s2); //Jakia
		
		int i1 = 22;
		int i2 = 18;
		System.out.println(s1+" is "+i1 +" years old"); //Jobayer is 22 years old
		System.out.println(s2+ " is "+28 +" years old"); //Jakia is 28 years old
		
		String s3 = s1+" is "+i1 +" Years old man ";
		
		System.out.println(s3); //Jobayer is 22 years old man
		String s4 = new String(s2+" is " +" Years old Woman "); //Jakia is 18 years old Woman
		System.out.println(s4);
		
		System.out.println(s4.length()); //26
		System.out.println(s4.charAt(7)); //i
	    System.out.println(s4.toUpperCase());
		System.out.println(s4.toLowerCase());
		System.out.println(s4.substring(11,17));
		System.out.println(s4.substring(11,16));
		
		String s5 = new String("abbu");
		String s6 = new String ("abbu");
		
		System.out.println(s5.equals(s6)); //true
		System.out.println(s5.compareTo(s6)); // 0
		
		
	}	
}