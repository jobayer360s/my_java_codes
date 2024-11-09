import java.lang.*;
import java.util.*;
public class Account
{
	private int accNum; //instance variable
	private String accName; //instance variable
	private double accBalance; //instance variable	
	public Account() //default cons
	{
		
	}
	Account(int accNum, String accName, double accBalance) //para cons
	{
		this.accNum = accNum;
		this.accName = accName;
		this.accBalance = accBalance;
	}
	//set methods
	public void setAccNum(int x)
	{
		accNum = x;
	}
	public void setAccName(String y)
	{
		accName = y;
	}
	public void setAccBalance(double z)
	{
		this.accBalance = z;
	}
	//get methods
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
		return accBalance;
	}
	//show methods
	public void Show()
	{
		System.out.println(this.accNum);
		System.out.println(accName);
		System.out.println(getAccBalance());
	}
	//send money methods
	public void sendMoney(Account a, double balance)
	{
		this.accBalance = this.accBalance - balance;
		a.accBalance = a.accBalance + balance;
	}
}