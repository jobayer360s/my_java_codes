import java.lang.*;
public class Example
{
	private int a, b, c;
	public Example()
	{
		System.out.println("Default cons!");
	}
	public Example(int a)
	{
		System.out.println("1 parameterized cons!");
	}
	public Example(int a, int b)
	{
		System.out.println("2 parameterized cons!");
	}
	public Example(int a, int b, int c)
	{
		System.out.println("3 parameterized cons!");
	}
}