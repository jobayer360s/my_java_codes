import java.lang.*;
public class SavingsAccount extends Account 
{
	double rate;
	public SavingsAccount() { }
	public SavingsAccount(String accNo, double accBalance, double rate)
	{
		super(accNo, accBalance);
		this.rate = rate;
	}
	public void setRate(double rate)
	{
		this.rate = rate;
	}
	public double getRate() { return this.rate; }
}