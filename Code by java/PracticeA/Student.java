
import java.lang.*;

public class Student{
	
	private int id;
	private String name;
	private double cgpa;
	
	public void setId(int a)
	{
		this.id = a;
	}
	public void setName(String b)
	{
		this.name = b;
	}
	
	public void setCgpa(double c)
	{
		this.cgpa = c;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public double getCgpa(){
		return cgpa;
	}
	
	public static void main (String [] args)
	{
		Student s1 = new Student();
		s1.setId(2350647);
		s1.setName("Jobayer");
		s1.setCgpa(3.95);
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getCgpa());
	}
	
	 
}