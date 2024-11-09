import java.lang.*;
public class FixedAccount extends Account 
{
	private int year;
	public FixedAccount() { }
	public FixedAccount(String accNo, double accBalance, int year)
	{
		super(accNo, accBalance);
		this.year = year;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	public int getYear() { return this.year; }
	public void show()
	{
		System.out.println("ACC no: "+this.accNo);
		System.out.println("ACC balance: "+this.accBalance);
		System.out.println("Duration: "+this.year);
	}
}