import java.lang.*;
import java.util.*;
public class ScannerDemo
{
	public static void main(String[] args)
	{
		//1. You have to take all string type input initially
		//2. nextLine() => Show entire String
		//	 next() => Show only 1st word
		//3. For showing character type input, you have to use string's method (charAt())
		
		Scanner obj1 = new Scanner(System.in);
		/**
		String name, id;
		int age;
		double cgpa;
		
		System.out.print("Name: ");
		name = obj1.nextLine();
		//System.out.println(name);
		
		System.out.print("ID: ");
		id = obj1.nextLine();
		//System.out.println(id);
		
		System.out.print("Age: ");
		age = obj1.nextInt();
		//System.out.println(age);
		
		System.out.print("CGPA: ");
		cgpa = obj1.nextDouble();
		System.out.println("Input done");
		**/
		/**
		String s1, s2;
		System.out.print("Enter 1st String: ");
		s1 = obj1.nextLine();
		System.out.println(s1);
		System.out.print("Enter 2nd String: ");
		s2 = obj1.next();
		System.out.println(s2);
		**/
		String s3;
		System.out.print("Enter a character: ");
		s3 = obj1.nextLine();
		System.out.println(s3.charAt(0));
	}
}