import java.lang.*;
import java.util.*;
public class Box 
{
	private int height; //instance variables
	private int weight;
	private int length;
	public Box() //default cons
	{
		
	}
	public Box(int a, int b, int c) //para cons
	{
		this.height = a;
		this.weight = b;
		this.length = c;
	}
	//set methods
	public void setHeight(int x)
	{
		this.height = x; 
	}
	public void setWeight(int y)
	{ 
		this.weight = y; 
	}
	public void setLength(int z)
	{ 
		this.length = z; 
	}
	//get methods
	public int getHeight()
	{ 
		return this.height; 
	}
	public int getWeight()
	{ 
		return this.weight; 
	}
	public int getLength()
	{
		return this.length;
	}
	//show methods
}