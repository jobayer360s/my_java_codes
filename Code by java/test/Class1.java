import java.lang.*;

public class Class1 {
	    boolean b1 = true ;
		int a=5;
		int b=3;
		
		public Class1(){
		System.out.println("Default constuctor is Responding");
		b1 = false;
		System.out.println(b1);
		 a = 9;
		 b = 11;
		}
		public void Show()
		{
			System.out.println("Show pakage is Responding");
			System.out.println("Value of a is "+a);
			System.out.println("Value of b is "+this.b);
			
		}
		
         public static void main(String [] args)
	       {			
		    Class1 obj1;
			obj1 = new Class1();
			
			Class1 obj2 = new Class1();
			obj2.Show();
             
			}				 
}