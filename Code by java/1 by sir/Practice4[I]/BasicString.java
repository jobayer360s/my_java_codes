import java.lang.*;
public class BasicString
{
	public static void main(String[] args)
	{
		int i1 = 5;
		int i2 = 10;
		System.out.println("Text "+ (i1+i2)); //Text 15
		System.out.println("Text "+ i1+i2); //Text 510
		//System.out.println("Text "+ i1-i2);
		System.out.println(i1+i2 +" Text"); // 15 Text
		System.out.println((i1+i2) +" Text"); //15 Text
	}
}