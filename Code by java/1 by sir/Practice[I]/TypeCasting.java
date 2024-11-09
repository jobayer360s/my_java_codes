import java.lang.*;

public class TypeCasting
{
	public static void main(String[] args)
	{
		byte b1 = -128;
		System.out.println("Value of b1: "+b1);
		short s1;
		s1 = b1; //implicit casting
		System.out.println("Value of s1: "+s1);
		
		double d1 = 4.5;
		System.out.println("Value of d1: "+d1);
		int i1;
		i1 = (int)d1; //explicit casting
		System.out.println("Value of i1: "+i1);
		
		String sr1 = "123";
		int x = Integer.parseInt(sr1);
		System.out.println("Value of x: "+x);
	}
	
}