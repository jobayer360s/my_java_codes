import java.lang.*;
public abstract class Person 
{
	private int nid;
	protected String name;
	public Person() 
	{
		System.out.println("D.C Called for Person");
	}
	public Person(int nid, String name)
	{
		System.out.println("P.C called for Person");
		this.nid = nid;
		this.name = name;
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
	//public String getName() { return this.name; } //because name is protected
	
	public abstract void show();
	/*
	{
		System.out.println("NID: "+this.nid);
		System.out.println("Name: "+this.name);
		//System.out.println();
	}*/
}