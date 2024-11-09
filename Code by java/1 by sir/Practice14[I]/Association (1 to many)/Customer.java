import java.lang.*;
public class Customer 
{
	private String phnNumber;
	//A Customer has many Account
	private Account acc[]; //'Account acc[]' means acc[] is the array type representer of Account class
                         // and 'acc' is also an instance variable
	public Customer()
	{
		
	}
	public Customer(String phnNumber, int arraySize) //How many accounts you want to create == arraysize
	{
		this.phnNumber = phnNumber;
		acc = new Account[arraySize]; //Array 2nd approach
	}
	public void setPhoneNumber(String phnNumber)
	{
		this.phnNumber = phnNumber;
	}
	public String getPhoneNumber()
	{
		return this.phnNumber;
	}
	public void addAccount(Account ac) //set method which insert the obj in the array
	{
		boolean flag = false; //false means no account inserted!
		for(int i=0; i< acc.length; i++)
		{
			if(acc[i] == null)
			{
				acc[i] = ac;
				//System.out.println("Account Inserted!");
				flag = true;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println("Account Inserted!");
		}
		else 
		{
			System.out.println("Account can't insert");
		}
	}
	public void getAccount()
	{
		for(int i=0; i<acc.length; i++)
		{
			if(acc[i] != null)
			{
				System.out.println("Account "+(i+1)+" information:");
				acc[i].showDetails();
				System.out.println();
			}
		}
	}
	public void removeAccount(Account ac1)
	{
		int flag = 0; //0 means false 
		for(int i=0; i<acc.length; i++)
		{
			if(acc[i] == ac1)
			{
				acc[i] = null; //null means remove
				//System.out.println("Account removed!");
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Account removed!");
		}
		else 
		{
			System.out.println("Account doesn't exist!");
		}
	}
}