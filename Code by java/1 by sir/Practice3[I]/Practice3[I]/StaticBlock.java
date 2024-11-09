import java.lang.*;
public class StaticBlock
{
	public static int x; //class variable
	static //static block
	{
		x = 10;
		System.out.println("Stack block3 called!");
	}
	public StaticBlock()
	{
		System.out.println("Default cons called!");
	}
	static //static block
	{
		x = 10;
		System.out.println("Stack block1 called!");
	}
	public static void main(String[] args)
	{
		StaticBlock	obj1 = new StaticBlock();
		StaticBlock obj2 = new StaticBlock();
		System.out.println(StaticBlock.x);
		obj1.x = 20;
		System.out.println(StaticBlock.x);
	}
	static //static block
	{
		x = 10;
		System.out.println("Stack block2 called!");
	}
}
