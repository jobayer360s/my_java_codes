import java.lang.*;
import java.util.*;

public class Oree{
	public static void main(String args[]){
		
		Scanner obj1 = new Scanner(System.in);
		System.out.print("enter array size ");
		int size = obj1.nextInt();
		int arr1 [] = new int [size];
		
		System.out.println("input values ");
		
		for (int i = 0 ; i<arr1.length ; i++){
			
			System.out.print("enter the value "+(i+1)+"- ");
			arr1[i] = obj1.nextInt();
		}
		
		
		System.out.println("values are ");
		
		for (int i = 0 ; i<arr1.length ; i++){
			
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("using for each loop ");
		
		for (int value : arr1 ){
		System.out.println(value);	
		}
		
		
		
		System.out.println();
		
		System.out.println("using Do while loop ");
		
		int i2=0;
		do {
			System.out.println(arr1[i2]);
			i2++;
		}
		while(i2<arr1.length);
		
		System.out.println();
		System.out.println("using while loop ");
		
		int i3=0;
		while(i3<arr1.length)
		 {
			System.out.println(arr1[i3]);
			i3++;
		}
		
		
	}
}