public class B extends A 
{
	private int y;
	public B()
	{
		System.out.println("B");
	}
	public B(int x, int y)
	{
		super(x);
		this.y = y;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public int getY()
	{
		return y;
	}
	public void show()
	{
		super.show();
		System.out.println("Class B");
		System.out.println(y);
	}
}