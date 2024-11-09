import java.lang.*;
public abstract class Account 
{
	protected String accNo;
	protected double accBalance;
	public Account() { }
	public Account(String accNo, double accBalance)
	{
		this.accNo = accNo;
		this.accBalance = accBalance;
	}
	public void setAccNo(String accNo)
	{
		this.accNo = accNo;
	}
	public void setAccBalance(double accBalance)
	{
		this.accBalance = accBalance;
	}
	public abstract void show();
}