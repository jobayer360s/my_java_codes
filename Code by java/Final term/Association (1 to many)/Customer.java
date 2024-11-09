import java.lang.*;
public class Customer 
{
	private String phnNumber;
	private Account acc[];
	
	public Customer(String phnNumber , int size )
	{
		this.phnNumber =phnNumber;
		acc = new Account[size];
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
		boolean flag = false ;
		for(int i=0;i<acc.length;i++){
			if(acc[i]== null){
				
				acc[i]=ac;
				flag = true;
				break ;
			}
			
		}
		if(flag == true){
			System.out.println("Account inserted ");
		}
		else{
			System.out.println("failed to insert account ");
		}
	}
	public void getAccount(){
		for(int i=0;i<acc.length;i++){
			if(acc[i] != null){
				System.out.println("information of Account "+(i+1));
				acc[i].showDetails();
				System.out.println();
			}
			
		}
	}
	
	public void removeAccount(Account ac1){
		
		boolean flag = false;
		for(int i=0;i<acc.length;i++){
			if(acc[i] != null){
				acc[i] = null;
				flag = true;
				break;
			}
			
		}
		if(flag == true){
			System.out.println("Acoount removed  ");
		}
		else{
			System.out.println("Account doesn'nt exsist ");
		}
	}

}