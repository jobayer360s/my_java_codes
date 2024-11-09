
import java.lang.*;

public class Account{
	private int accountNumber ;
    private String accountHolderName ;
    private double balance ;
	
	
	public void setAccountNumber(int an)
	       {
		this.accountNumber =an;
	       }
	
    public void setAccountHolderName(String ahn)
           {
		this.accountHolderName =ahn;
	       }
	
    public void setBalance(double b)
      {
		this.balance =b;
	   }
   public int getAccountNumber(){
	   return accountNumber;
         }

   public String getAccountHolderName()
       {
	   return accountHolderName;
       }
   
   public double getBalance()
	  {
		 
		 return balance;
	 }
     public void showDetails()
	 {
   System.out.println("Showinhg detils by Show detils pakage ");
        System.out.println("Account number: "+accountNumber);
		System.out.println("Account holder name "+accountHolderName);
		System.out.println("balance "+balance);
	 }
   
}