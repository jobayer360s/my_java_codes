import java.lang.*;
public class StringMethods
{
	public static void main(String[] args)
	{
		String obj1 = new String("ABC");
		System.out.println(obj1); //ABC
		
		String s1 = "AIUB";
		System.out.println(s1); //AIUB
		
		int i1 = 21;
		String s2 = "I am "+i1+" years old";
		System.out.println(s2); //I am 21 years old
		System.out.println(s1.length()); //4
		System.out.println(s2.charAt(5)); //2
		System.out.println(s1.equals(s2)); //false
		
		String s3 = "AIUB";
		System.out.println(s1.equals(s3)); //true
		System.out.println(s1.compareTo(s3)); //0
		
		System.out.println(s2.indexOf("years")); //8
		System.out.println(s2.indexOf('a')); //2
		//I am 21 years old
		System.out.println(s2.substring(5, 13)); //21 years
		System.out.println(s2.substring(5, 12)); //21 year
		System.out.println(s2.toUpperCase()); //I AM 21 YEARS OLD
		System.out.println(s2.toLowerCase()); //i am 21 years old
		System.out.println(s2.isEmpty()); //false
		System.out.println(s1.concat(s3)); //AIUBAIUB
	}
}