import java.lang.*;
public class Start 
{
	public static void main(String[] args)
	{
		Account a1 = new Account();
		a1.setAccNum(1);
		a1.setAccName("Mr A");
		a1.setAccBalance(500.00);
		a1.showDetails();
		System.out.println();
		
		Customer c1 = new Customer();
		c1.setAccount(a1); //1 to 1 (association)
		c1.setPhnNum("01234567891");
		c1.showDetails();
		System.out.println();
		
		Account a2 = new Account(2,"Mr B", 700.00);
		Customer c2 = new Customer("12345", a2);
		c2.showDetails();
		System.out.println();
		
		System.out.println("Account Balance: "+c2.getAccount().getAccBalance());
	}
}