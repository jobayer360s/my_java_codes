import java.lang.*;
import java.util.*;
public class A 
{
	private int x;
	public A()
	{
		System.out.println("A");
	}
	public A(int x)
	{
		this.x = x;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public int getX()
	{
		return x;
	}
	public void show()
	{
		System.out.println("Class A");
		System.out.println(x);
	}
}