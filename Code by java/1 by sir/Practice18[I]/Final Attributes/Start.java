import java.lang.*;
public class Start 
{
	public static void main(String[] args)
	{
		Example obj1 = new Example();

		System.out.println(obj1.getX());
		System.out.println(obj1.getY());
		
		Example obj2 = new Example(300);
		System.out.println(obj2.getX());
		System.out.println(obj2.getY());
		
		Example obj3 = new Example();
		System.out.println(obj3.getX());
		System.out.println(obj3.getY());
	}
}