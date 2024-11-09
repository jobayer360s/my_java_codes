import java.lang.*;
public class Customer 
{
	private String phnNum;
	//a Customer has an Account
	private Account acc; //'Account acc' means acc is the representer of Account class
                         // and 'acc' is also an intance variable
	public Customer()
	{
		
	}	
	public Customer(String phnNum, Account ac1)
	{
		this.phnNum = phnNum;
		this.acc = ac1;
	}
	public void setPhnNum(String phnNum)
	{
		this.phnNum = phnNum;
	}
	public void setAccount(Account ac)
	{
		this.acc = ac;
	}
	public String getPhnNum()
	{
		return this.phnNum;
	}
	public Account getAccount()
	{
		return this.acc;
	}
	public void showDetails()
	{
		System.out.println("Phone Number: "+this.getPhnNum());
		/*
		System.out.println("Account Number: "+acc.getAccNum());
		System.out.println("Account Name: "+acc.getAccName());
		System.out.println("Account Balance: "+acc.getAccBalance());
		*/
		acc.showDetails();
	}
}