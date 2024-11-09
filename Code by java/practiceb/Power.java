import java.lang.*;

public class Power {
	
	public static void main (String [] args)
	{
		 Account a1 = new Account();
		  a1.setAccountNumber(1258);
		  a1.setAccountHolderName("Henry meccarthy");
		  a1.setBalance(5000);
		  
		  System.out.println(a1.getAccountNumber());
		System.out.println(a1.getAccountHolderName());
		System.out.println(a1.getBalance());
		  
		  a1.showDetails();
	}
	
}


