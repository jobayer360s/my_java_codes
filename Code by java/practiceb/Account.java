import java.lang.*;

public  class Account {
	  
	private int accountNumber ;
    private String accountHolderName ;
    private double balance ;
	
 public void setAccountNumber(int an)
    {
	 this.accountNumber = an;
     }
  public void setAccountHolderName(String ahn)
   {
	   this.accountHolderName = ahn;
   }
  public void setBalance(double b)
   {
	   this.balance = b;
   }
  public int getAccountNumber()
   {
	   System.out.println("Account Number is ");
	   return accountNumber;
   }
  public String getAccountHolderName()
   {
	  System.out.println("Account holder name is ");
	   return accountHolderName;
   }
   
  public double getBalance()
   {
	   System.out.print("Balance is ");
	   return balance;
   }
   public void showDetails( )
   {
	   System.out.println("Showing by Show detils method ");
	   System.out.println("SD Account Number is "+accountNumber);
	   System.out.println("Sd Account holder name is "+accountHolderName);
   }
	  
	 
	  
}