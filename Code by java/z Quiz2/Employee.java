import java.util.*;
import java.lang.*;
public class Employee extends Person{
	
	private String joiningDate;
	private double salary;
	
	Employee(){}
    Employee(int age, String name, double mass, String joiningDate, double salary)
	{
		super(age, name,mass);
		this.joiningDate = joiningDate;
		this.salary = salary;
	}
	
	
	public void setJoiningDate(String date)
	{
		this.joiningDate = date;
	}
    public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public String getJoiningDate()
	{
		return joiningDate ;
	}
	
    public double getSalary(){
		return this.salary;
	}
	
	
	public double weightCalculate() 
	{
		double wc = super.getMass()*9.8;
		return wc;
	}
     public double annualSalary()
   {
	   double as = 12*salary;
	   return as;
   }


      public void showInfo(){
	   super.showInfo();
	   System.out.println("Joining Date is " +getJoiningDate());
	   System.out.println("SAlary is " +getSalary());
	   
	   double wei = this.weightCalculate();
	   double ans = this.annualSalary();
       System.out.println("Annual salary is " +ans);
	   System.out.println("Calculated weight is " +wei);
   }

	
	
}