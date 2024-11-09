public class Start 
{
	public static void main(String[] args)
	{
		Circle obj1 = new Circle();
		obj1.Area();
		System.out.println();
		
		Circle obj2 = new Circle(2);
		obj2.Area();
		System.out.println();
		
		Triangle obj3 = new Triangle(5,6);
		obj3.Area();
	}
}