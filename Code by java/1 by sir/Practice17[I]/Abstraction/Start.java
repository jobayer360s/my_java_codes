public class Start 
{
	public static void main(String[] args)
	{
		//Person obj1 = new Person(); //gives error, because Person is now abstract class
		Student obj2 = new Student(1, "Mr A", 3.25);
		obj2.show();
	}
}