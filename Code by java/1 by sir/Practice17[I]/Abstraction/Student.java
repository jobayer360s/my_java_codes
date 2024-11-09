/*
	this() means Default cons of this class
	this(....) means Parameterized cons of this class
	super() means Default cons of Super class
	super(...) means Parameterized cons of Super class
*/
import java.lang.*;
public class Student extends Person 
{
	private double cgpa;
	public Student()
	{
		System.out.println("D.C called for Student");
	}
	public Student(int nid, String name, double cgpa)
	{
		//super(); //called D.C for Person
		//super(nid, name); //called P.C for Person
		//this(); //called D.C for Student
		//You must use super or this at a time for calling constructor
		//D.C of super is called always called by defacult
		this.cgpa = cgpa;
		System.out.println("P.C called for Student");
	}
	public void setCgpa(double cgpa) { this.cgpa = cgpa; }
	public double getCgpa() { return this.cgpa; }
	public void show()
	{
		//super.show(); //gives error, because show() is now abstact method
		System.out.println("NID: "+this.getNid());
		System.out.println("Name: "+this.name);
		System.out.println("CGPA: "+cgpa);
	}
}