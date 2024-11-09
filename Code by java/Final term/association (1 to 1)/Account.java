import java.lang.*;
public class Account{
	private int accNumber;
	private double balance;
	private String accName;
	
	public Account(){}
	
	public Account(int accNumber , String accName , double balance){
		this.accNumber = accNumber ;
		this.accName = accName;
		this.balance = balance;	
	}
	
	public void setAccNum(int accNumber){
		this.accNumber = accNumber;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public void setAccName(String accName){
		this.accName = accName;
	}
	
	
	public int getAccNum(){
		return this.accNumber;
	}
	
	public String getAccName(){
		return this.accName;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public void showDetils(){
		System.out.println("Account number is "+this.getAccNum());
		System.out.println("Account name is "+this.getAccName());
		System.out.println("Account Balance is "+this.getBalance());
	}
	
}