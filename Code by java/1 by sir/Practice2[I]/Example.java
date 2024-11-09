import java.lang.*;
public class Example
{
	double length, height, width;
	
	public Example()
	{
		System.out.println("Default cons called!");
		this.length = 0.0;
		height = 0.0;
		width = 0.0;
	}
	public Example(double length, double height, double width)
	{
		System.out.println("Para cons called!");
		this.length = length;
		this.height = height;
		this.width = width;
	}
	public void Show()
	{
		System.out.println("Length: "+length);
		System.out.println("Height: "+this.height);
		System.out.println("Width: "+this.width);
	}
	public double VolumeCalculate()
	{
		double result = this.length*height*this.width;
		return result;
	}
	public static void main(String[] args)
	{
		Example obj1 = new Example();
		obj1.Show();
		//System.out.println("Hello!");
		Example obj2 = new Example(1.1, 2.2, 3.3);
		obj2.Show();
		double res = obj2.VolumeCalculate();
		System.out.println("Volume: "+res);
	}
}