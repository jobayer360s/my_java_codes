import java.lang.*;
public class Start 
{
	public static void main(String[] args)
	{
		//public Account(int accNum, String accName, double accBalance)
		Account a1 = new Account(1 , "Mr a", 500.000);
		Account a2 = new Account();
		System.out.println();
		a2.setAccNum(2);
		a2.setAccName("Mr b");
		a2.setAccBalance(600);
		Account a3 = new Account(2 , "Mr C", 500.000);
		Account a4 = new Account(3 , "Mr D", 700.000);
		Account a5 = new Account(4 , "Mr E", 800.000);
		Account a6 = new Account(5 , "Mr F", 900.000);
		Account a7 = new Account(6 , "Mr G", 1000.000);
		
		Customer c1 = new Customer("1234" , 5 );
		c1.addAccount(a1);
		c1.addAccount(a2);
		c1.addAccount(a3);
		c1.addAccount(a4);
		c1.addAccount(a5);
		c1.addAccount(a6);
		c1.getAccount();
		c1.removeAccount(a1);
		c1.removeAccount(a2);
		c1.addAccount(a6);
	}
}