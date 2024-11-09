public class Triangle extends Shape
{
	private int a;
	public Triangle()
	{
		System.out.println("Triangle D.C");
	}
	public Triangle(int x, int y)
	{
		super(x);
		this.a = y;
		System.out.println("Triangle P.C");
	}
	public void setA(int a)
	{
		this.a = a;
	}
	public int getA()
	{
		return this.a;
	}
	public void Area()
	{
		double result = 0.5 * super.getX() * this.getA();
		System.out.println("Area of triangle: "+result);
	}
}