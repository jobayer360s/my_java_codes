import java.lang.*;
public class Start 
{
	public static void main(String[] args)
	{
		//Account obj1 = new Account(); //Gives error because Account is abstract class
		SavingsAccount obj1 = new SavingsAccount("A1",500.00,0.8);
		obj1.show();
		System.out.println();
		
		FixedAccount obj2 = new FixedAccount("A2",20000.00,1);
		obj2.show();
		System.out.println();
		
		Customer c1 = new Customer(1,"Mr X", 5);
		c1.addAccount(obj1); //obj1 is SavingsAccount which is the child of Account
		c1.addAccount(obj2); //obj2 is FixedAccount which is the child of Account
		c1.showAllAccounts();
	}
}