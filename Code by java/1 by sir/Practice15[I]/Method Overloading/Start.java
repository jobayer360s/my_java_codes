import java.lang.*;
public class Start 
{
	public static void main(String[] args)
	{
		Example obj1 = new Example();
		obj1.show();
		obj1.show(1);
		int result = obj1.show(1,2);
		System.out.println(result);
	}
}