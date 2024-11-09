import java.lang.*;

public class OOP1Class
{
	boolean b1 = true;
	int x = 5;
	int y;
	
	public OOP1Class()
	{
		System.out.println("Default cons calling!");
		x = 7;
		y = 1;
		b1 = false;
		System.out.println(b1);

	}
	
	public void Show()
	{
		System.out.println("Showing!");
		System.out.println(b1);
		System.out.println(this.x);
		System.out.println(this.y);
	}
	
	public static void main(String[] args)
	{
		OOP1Class obj1; //object crate
		obj1 = new OOP1Class(); //object initialize
		
		OOP1Class obj2 = new OOP1Class();
		System.out.println(obj2.b1);
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		obj2.Show();

	}
}
