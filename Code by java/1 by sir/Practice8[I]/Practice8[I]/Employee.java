import java.lang.*;
import java.util.*;
public class Employee extends Person
{
	private String joiningDate;
	private double salary;
	Employee()
	{
		
	}
	Employee(int age, String name, double mass, String joiningDate, double salary)
	{
		super(age, name, mass);
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
		return this.joiningDate;
	}
	public double getSalary()
	{
		return this.salary;
	}
	public double weightCalculate()
	{
		double result1 = super.getMass() * 9.8;
		return result1;
	}
	public double annualSalary()
	{
		double result2 = this.salary * 12;
		return result2;
	}
	public void showInfo()
	{
		super.showInfo();
		System.out.println("Joining Date: "+this.joiningDate);
		System.out.println("Salary: "+this.salary);
		//System.out.println("Age: "+super.getAge());
		double res1 = this.weightCalculate();
		double res2 = this.annualSalary();
		System.out.println("Weight: "+res1);
		System.out.println("Annual Salary: "+res2);
	}
}