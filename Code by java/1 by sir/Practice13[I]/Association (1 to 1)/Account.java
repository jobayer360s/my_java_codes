import java.lang.*;
public class Account 
{
	private int accNum;
	private String accName;
	private double accBalance;
	public Account()
	{
		
	}
	public Account(int accNum, String accName, double accBalance)
	{
		this.accNum = accNum;
		this.accName = accName;
		this.accBalance = accBalance;
	}
	public void setAccNum(int accNum)
	{
		this.accNum = accNum;
	}
	public void setAccName(String accName)
	{
		this.accName = accName;
	}
	public void setAccBalance(double accBalance)
	{
		this.accBalance= accBalance;
	}
	public int getAccNum() 
	{
		return this.accNum;
	}
	public String getAccName()
	{
		return this.accName;
	}
	public double getAccBalance()
	{
		return this.accBalance;
	}
	public void showDetails()
	{
		System.out.println("Account Number: "+this.accNum);
		System.out.println("Account Name: "+this.getAccName());
		System.out.println("Account balance: "+this.getAccBalance());
	}
}