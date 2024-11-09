import java.lang.*;
import java.util.*;

public class Input{	
	public void total(int a , int b)
	{
		int c = a+b ;
		System.out.println("age id togather "+c);
	}
	
	public static void main (String[] args)
	{
		String name ;
		int id , age ;
		double income ;
		
		Scanner obj1 = new Scanner(System.in);
		
		System.out.print("Enter your Name ");
		name = obj1.nextLine();
		
		
		System.out.print("Enter another string ");
		String s1 =new String(obj1.nextLine());
        System.out.println("Another String is " +s1);
		
		System.out.print("Enter a charecter ");
		String c1 = obj1.nextLine();
		if(c1.length()>1){
			System.out.println("Input error , enter charecter correctly");
			System.out.print("Enter a charecter correctly ");
				String c2 = obj1.nextLine();
				 System.out.println("Your charecter is " +c2.charAt(0));
			
		}
		else{
        System.out.println("Your charecter is " +c1.charAt(0));}
		
		/*System.out.print("Enter your age ");
		age = obj1.nextInt();
		
		
		System.out.print("Enter your id ");
		id = obj1.nextInt();
		
		
		System.out.print("Enter your income ");
		income = obj1.nextDouble();
			
        
		System.out.println();
		System.out.println("your age is " +name);
		System.out.println("your Age is " +age);
		System.out.println("your id is " +id);
		System.out.println("your income is " +income);*/
		
		
	}
	
}