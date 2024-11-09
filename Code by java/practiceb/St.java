import java.lang.*;

public class St{
	public int id = 5 ;
  int	pass =6 ;

	public static int a;
	
	static{
		System.out.println("static block 1 is heere");
		a = 10 ;
	}
	
	
	public St ()
	{
		
		System.out.println("Default cons is heere");
	}
	
	public void St (int x , int y)
	{
		this.id = x;
		this.pass = y;
		
	}
	
	public void show()
	{
		System.out.println("id is " +id);
		System.out.println("Pass is "+pass);
	}
	
	static{
		System.out.println("static block 5 is heere");
		
	}
	
	public static void main(String[] args)
	{
		St s1 = new St();
		System.out.println(St.a);
		a = 5;
		System.out.println(St.a);
		
		System.out.println("Object 2");
		St s2 = new St(22 , 45);
		s2.show();
	}	
	
	static{
		System.out.println("static block 69 is heere");
		
	}
}