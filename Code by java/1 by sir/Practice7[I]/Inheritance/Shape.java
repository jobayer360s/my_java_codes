public class Shape 
{
	private int x;
	public Shape()
	{
		System.out.println("Shape D.C");
	}
	public Shape(int a)
	{
		System.out.println("Shaper P.C");
		this.x = a;
	}
	public void setX(int a)
	{
		this.x = a;
	}
	public int getX()
	{
		return this.x;
	}
	public void Area()
	{
		System.out.println("No area to show");
	}
}