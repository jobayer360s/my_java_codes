import java.lang.*;
import java.util.*;
public class Array 
{
	public static void main(String[] args)
	{
		//1st approach
		//size known, elements unknown
		int arr1[] = new int[5];
		int []arr2 = new int[5];
		
		arr1[0] = 1;
		arr2[1] = 2;
		
		for (int i = 0; i<5; i++)
		{
			System.out.print(arr1[i]+" ");
			
		}
		System.out.println();
		
		//2nd approach
		//size unknown, elements unknown
		int arr3[];
		int size = arr2[1]; //size = 2
		arr3 = new int[size];
		for (int i = 0; i<size; i++)
		{
			System.out.print(arr3[i]+" ");
			
		}		
		System.out.println();
		
		//3rd approach
		//size unknown, elements knows
		int arr4[] = new int[] {1,2,3,4,5};
		System.out.println(arr4[4]);
		for (int i = 0; i< arr4.length ;i++)
		{
			System.out.println(arr4[i]);
		}
		System.out.println();
		for (int value : arr4) //for each loop
		{
			System.out.println(value);
		}
	}
}