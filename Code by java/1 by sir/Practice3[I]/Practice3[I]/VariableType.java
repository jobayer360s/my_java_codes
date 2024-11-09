import java.lang.*;
public class VariableType
{
	int y; //instance variable
	public static int z = 30; //class variable
	public static void main(String[] args)
	{
		int x = 10; //local variable
		System.out.println(x);
		
		VariableType obj1 = new VariableType();
		System.out.println(obj1.y);
		
		System.out.println(VariableType.z);
	}
}