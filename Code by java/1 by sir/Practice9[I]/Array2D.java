import java.lang.*;
import java.util.*;
public class Array2D 
{
	public static void main(String[] args)
	{
		//[a][b] => a represents row number and b represents column number
		//1st approcah: size known, elements unknown
		int arr1[][] = new int[3][4];
		arr1[2][3] = 5;
		System.out.println(arr1[2][3]);
		
		//2nd approcah: size unknown, elements unknown
		int arr2[][];
		int row, column;
		row = 2;
		column = 2;
		arr2 = new int[row][column];
		arr2[1][1] = 10;
		System.out.println(arr2[1][1]);
		
		//3rd approcah: size unknown, elements known
		int arr3[][] = new int[][]
							{{1,2},
							 {3,4}};
		for(int i=0;i<2;i++) //i represents row number
		{
			for(int j=0;j<2;j++) //j represents column number
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		int arr5[][] = new int[][]
							{{5,6,7},
							 {8,9}};
		for(int i=0;i<arr5.length;i++) //i represents row number
		{
			for(int j=0;j<arr5.length;j++) //j represents column number
			{
				System.out.print(arr5[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		int arr4[][] = new int[][]
							{{5,6,7},
							 {8,9}};
		for(int i=0;i<2;i++) //i represents row number
		{
			for(int j=0;j<3;j++) //j represents column number
			{
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}