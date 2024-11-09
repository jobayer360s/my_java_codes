import java.lang.*;
public class Start 
{
	public static void main(String[] args)
	{
		FixedAccount f1 = new FixedAccount("A1", 50000, 1);
		System.out.println("Fixed Account balance: "+f1.getAccBalance());
		
		SavingsAccount s1 = new SavingsAccount("A2", 500, 2);
		System.out.println("Savings Account balance: "+s1.getAccBalance());
		
		Account a1 = new Account("A3.1", 1000);
		System.out.println("Account Balance: "+a1.getAccBalance());
		
		Customer c1 = new Customer(1, "Mr X", 3);
		Account a2 = new Account("A3.2", 2000);
		Account a3 = new Account("A3.3", 3000);
		c1.addAccount(a1); //index 0 = a1
		c1.addAccount(a2); //index 1 = a2
		c1.addAccount(a3); //index 2 = a3
		c1.removeAccount(a2); //index 1 = null
		c1.showAllAccounts();
	}
}