import java.lang.*;
public class Customer{
	private int phnNum;
	private Account acc;
	
	public Customer(){}
	
	public Customer(int phnNum , Account acc1){
		this.phnNum = phnNum;
		this.acc = acc1;
	}
	
	public void setPhnNum(int phnNum){
		this.phnNum = phnNum;
	}
	
	public void setAcc(Account acc1){
		this.acc = acc1;
	}
	
	public int getPhnNum(){
		return this.phnNum;
	}
	
	public Account getAcc(){
		return this.acc;
		
	}
	public void showDetils(){
		
		System.out.println("Phone number is_ "+this.getPhnNum());
		/*System.out.println("Account number is_ "+acc.getAccNum());
		System.out.println("Account name is_ "+acc.getAccName());
		System.out.println("Account balance is_ "+acc.getBalance());*/
		this.acc.showDetils();
	}
	
}