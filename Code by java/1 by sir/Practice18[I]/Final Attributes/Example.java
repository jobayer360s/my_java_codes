import java.lang.*;
public class Example 
{
	private final int x = 100; //value assign while decalring
	private final int y;
	public Example()
	{
		this.y = 200; //value assign in constructor
	}
	public Example(int y)
	{
		this.y = y; //value assign in constructor
	}
	//public void setX(int x) {this.x = x;} //because x is now final attribute
	//public void setY(int y) {this.y = y;} //because y is now final attribute
	public int getX() {return this.x;}
	public int getY() {return this.y;}
}