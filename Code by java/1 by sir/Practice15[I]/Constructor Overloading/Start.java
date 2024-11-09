import java.lang.*;
public class Start 
{
	public static void main(String[] args)
	{
		Example obj1 = new Example();
		Example obj2 = new Example(1);
		Example obj3 = new Example(1,2);
		Example obj4 = new Example(1,2,3);
		System.out.println();
		
		Example obj5 = new Example();
		obj5 = new Example(1);
		obj5 = new Example(1,2);
		obj5 = new Example(1,2,3);
		
		//Example obj5;
		//obj5 = new Example();
		
		new Example();
	}
}