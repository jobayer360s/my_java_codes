import java.lang.*;
public class Start{	
	public static void main(String [] args){
		
		Account a1 = new Account();
		a1.setAccNum(1);
		a1.setAccName("Shaikh Hasina ");
		a1.setBalance(1000);
		a1.showDetils();
		
		System.out.println();
		
		Customer c1 = new Customer();
		c1.setPhnNum(123456);
		c1.setAcc(a1);
		c1.showDetils();
		System.out.println();
	    System.out.println("Account name is :- "+c1.getAcc().getAccName());
		
		System.out.println();
		Account a2 = new Account(2, "Khaleda zia", 800);
		Customer c2 = new Customer(987654, a2);
		c2.showDetils();
		
		
	}
}