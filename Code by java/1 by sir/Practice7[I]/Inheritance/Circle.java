public class Circle extends Shape
{
	public Circle()
	{
		System.out.println("Circle D.C");
	}
	public Circle(int a)
	{	
		super(a);	
		System.out.println("Circle P.C");
	}
	public void Area()
	{
		double ar = 3.1416 * super.getX() * super.getX();
		System.out.println("Area of circle: "+ar);
	}
}