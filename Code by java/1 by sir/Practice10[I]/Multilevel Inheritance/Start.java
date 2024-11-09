public class Start 
{
	public static void main(String[] args)
	{
		A obj1 = new A(5);
		obj1.show();
		System.out.println();
		
		B obj2 = new B(5,10);
		obj2.show();
		System.out.println();
		
		C obj3 = new C(5,10,15);
		obj3.show();
		System.out.println();
		
		C obj4 = new C();
	}
}