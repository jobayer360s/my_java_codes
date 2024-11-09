import java.lang.*;
public class Start 
{
	public static void main(String[] args)
	{
		Account a1 = new Account();
		a1.setAccNum(1);
		a1.setAccName("Mr M");
		a1.setAccBalance(500.00);
		//a1.showDetails();
		
		Account a2 = new Account(2, "Mr M", 600.00);
		//a2.showDetails();
		Account a3 = new Account(3, "Mr M", 750.00);
		Account a4 = new Account(4, "Mr M", 800.00);
		Account a5 = new Account(5, "Mr M", 850.00);
		Account a6 = new Account(6, "Mr M", 900.00);
		
		Customer c1 = new Customer("013234", 5); //size 2
		//c1.setPhoneNumber("013234");
		c1.addAccount(a1); //index 0 = a1
		c1.addAccount(a2); //index 1 = a2
		c1.addAccount(a3); //index 2 = a3
		c1.addAccount(a4); //index 3 = a4
		c1.addAccount(a5); //index 4 = a5
		c1.addAccount(a6); //Can't insert!!
		
		c1.getAccount();
		
		c1.removeAccount(a3); //index 2 = null
		c1.getAccount();
		
		c1.addAccount(a6); //index 2 = a6
		c1.getAccount();
	}
}