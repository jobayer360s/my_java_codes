import java.lang.*;
import java.util.*;
public class Start 
{
	public static void main(String[] args)
	{
		Account obj1 = new Account();
		obj1.setAccNum(1234);
		obj1.setAccName("Arif");
		obj1.setAccBalance(1250.50);
		obj1.Show();
		System.out.println();
		
		Account obj2 = new Account(234, "Tamim", 850.25);
		obj2.Show();
		System.out.println();
		
		obj1.sendMoney(obj2, 200);
		System.out.println(obj1.getAccBalance());
		System.out.println(obj2.getAccBalance());
		
	}
}