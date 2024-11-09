
import java.lang.*;

public class Start{
	public static void main(String[] args){
		Account a1 = new Account();
		a1.setAccountNumber(123456);
		a1.setAccountHolderName("Jobayer shaikh");
        a1.setBalance(99099857.5);
		
		System.out.println(a1.getAccountNumber());
		System.out.println(a1.getAccountHolderName());
		System.out.println(a1.getBalance());
		a1.showDetails();
		

	}
}