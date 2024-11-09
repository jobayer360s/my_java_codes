import java.lang.*;
public class Box
{
	private double lenght, height, width;
	public Box()
	{
		System.out.println("Default cons");
		//this.lenght = 0.0;
		height = 0.0;
		width = 0.0;
	}
	public void setLenght(double a)
	{
		this.lenght = a;
	}
	public void setHeight(double b)
	{
		this.height = b;
	}
	public void setWidth(double c)
	{
		this.width = c;
	}
	public double getLenght()
	{
		return lenght;
	}
	public double getHeight()
	{
		return height;
	}
	public double getWidth()
	{
		return width;
	}
	public Box(double a, double b, double c)
	{		
		System.out.println("Para cons");
		this.lenght = a;
		this.height = b;
		this.width = c;
	}
	public void Show()
	{
		System.out.println("Length: "+lenght);
		System.out.println("Height: "+height);
		System.out.println("Width: "+width);

	}
	public static void main(String[] args)
	{
		Box obj1 = new Box();
		obj1.setLenght(2.2);
		obj1.setHeight(3.3);
		obj1.setWidth(3.4);
		System.out.println(obj1.getLenght());
		obj1.Show();
	}
}