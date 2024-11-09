import java.lang.*;
import java.util.*;
public class Person 
{
	private int age;
	private String name;
	private double mass;
	Person()
	{
	}
	Person(int age, String name, double mass)
	{
		this.age = age;
		this.name = name;
		this.mass = mass;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setMass(double mass)
	{
		this.mass = mass;
	}
	public int getAge()
	{
		return this.age;
	}
	public String getName()
	{
		return this.name;
	}
	public double getMass()
	{
		return this.mass;
	}
	public void showInfo()
	{
		System.out.println("Age: "+this.age);
		System.out.println("Name: "+this.getName());
		System.out.println("Mass: "+this.mass);
	}
}
