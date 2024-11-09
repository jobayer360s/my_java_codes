import java.lang.*;

public class Person {
	
	private String name;
	private int nationalId;
	private int age;
	private double height;
	
	public Person()
	{
		System.out.println("Default constructor is responding");
	}
	
	public void Person(String name , int nationalId , int age , double height)
	{
		this.name = name;
		this.nationalId = nationalId;
		this.age = age;
		this.height = height;
	}
	
	public void setName (String name)
	{
		this.name = name;
	}
	public void setNationalId(int id)
	{
		nationalId = id;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setHeight (double height)
	{
		this.height = height;
	}
	
	public String getName()
	{
	return name;	
	}
	
	public int getNationalId(){
		
		return nationalId;
	}
	
	public int getAge(){
		return age;
	}
	public double getHeight(){
		return height;
	}
	
	public void showDetails()
	{
		System.out.println("using show detils ");
		System.out.println("name is "+name);
		System.out.println("national id is "+nationalId);
		System.out.println("Age is "+age);
		System.out.println("Height is "+height);
	}
	
	public static void main(String [] args)
	{
		Person p1 = new Person();
		p1.setName("Jobayer");
		p1.setNationalId(123456);
		p1.setAge(21);
		p1.setHeight(5.9);
		System.out.println("Info about person 1");
		System.out.println("name is "+p1.getName());
		System.out.println("national id is "+p1.getNationalId());
		System.out.println("Age is "+p1.getAge());
		System.out.println("Height is "+p1.getHeight());
		
		System.out.println("Info about person 2");
		Person p2 = new Person();
		p2.Person("Jahid khan", 654321 ,22 , 5.7);
		p2.showDetails();	
	}	
}