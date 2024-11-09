import java.lang.*;
import java.util.*;

public class Marr{
	
	public static void main(String [] args)
	{
		int a [] = new int[3];
		a[0] = 5;
		a[1] = 6;
		a[2] = 7;
		
		System.out.println(a[1]);
		for(int i =0 ; i<a.length ; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size ");
		int size = sc.nextInt();
		int b[] = new int [size];
		
		System.out.print("give Input ");
		for(int i=0 ; i<size ; i++){
			System.out.print("Enter value of " +(i+1) +" ");
			b[i] = sc.nextInt();
		}
		System.out.println();
				System.out.println("Showing output ");
		for(int i=0 ; i<b.length ; i++){
			System.out.println("THe value of " +(i+1) +" is "+b[i]);

		}
		
		System.out.println();
		
		//3rd approch
		
		int d [] = new int [] {1, 2 , 3, 4 , 5};
		
		System.out.println("Showing output for d ");
		for(int i=0 ; i<d.length ; i++){
			System.out.println("THe value of " +(i+1) +" is "+d[i]);
		
	}
}