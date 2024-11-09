import java.lang.*;
import java.util.*;

public class Astring{
public static void main(String [] args){
	
	Scanner ob1 = new Scanner(System.in);
	
	System.out.print("Enter a string ");
	String s1 = ob1.nextLine();
	System.out.println("your string is "+s1);
	System.out.println("lentgh is "+s1.length());
	
	System.out.println();
	System.out.print("Enter another string ");
	String s2 = new String(ob1.nextLine());
	System.out.println("your string is "+s2);
	System.out.println("lentgh is "+s2.length());
}}