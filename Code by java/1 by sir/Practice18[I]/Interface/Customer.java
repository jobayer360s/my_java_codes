import java.lang.*;
public class Customer implements AccountOperations
{
	private int nid;
	private String name;
	//Customer has many Accounts
	private Account acc[]; //1 to many association
	public Customer() { }
	public Customer(int nid, String name, int arraySize) 
	{
		this.nid = nid;
		this.name = name;
		this.acc = new Account[arraySize]; 
	}
	public void setNid(int nid) 
	{
		this.nid = nid;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getNid() { return this.nid; }
	public String getName() { return this.name; }
	
	public void addAccount(Account ac)
	{
		int flag = 0;
		for(int i=0; i<acc.length; i++)
		{
			if(acc[i] == null)
			{
				acc[i] = ac;
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			System.out.println("Account inserted!");
		else 
			System.out.println("Can't insert!");
	}
	public void removeAccount(Account ac)
	{
		boolean flag = false;
		for(int i=0; i<acc.length; i++)
		{
			if(acc[i] == ac)
			{
				acc[i] = null;
				flag = true;
				break;
			}
		}
		if(flag == true)
			System.out.println("Account removed!");
		else 
			System.out.println("Account doesn't exist!");
	}
	public void showAllAccounts()
	{
		for(int i=0; i<acc.length; i++)
		{
			if(acc[i] != null)
			{
				System.out.println("*****Account "+i+" information");
				System.out.println("NID: "+this.getNid());
				System.out.println("Name: "+this.name);
				acc[i].show();
				//System.out.println("Account No: "+acc[i].accNo);
				//System.out.println("Account Balance: "+acc[i].accBalance);
			}
		}
	}
}