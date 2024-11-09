import java.lang.*;
import java.util.*;

public class Bag {
	private String name;
	private int height;
	private int length;
	
	Bag(){}
	
	public Bag(String name , int height , int length)
	{
		this.name = name;
		this.height =height;
		this.length = length;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setHeight(int height)
	{
		this.height =height;
	}
	
	public void setLength(int length)
	{
		this.length = length;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getHeight()
	{
		return this.height;
	}
	
	public int getLength()
	{
      return this.length;
	 
	}
	
	public void showDetils(){
		System.out.println("name is "+name);
		System.out.println("Height is "+height);
		System.out.println("Lenghth is "+length);
		
	}

  public static void main(String [] args){
		Bag b1 = new Bag();
		b1.setName ("Adidas");
		b1.setHeight(5);
		b1.setLength(6);
		b1.showDetils();
		
		System.out.println();
		Bag b2 = new Bag("Saint eaglee" , 10 ,12);
		Bag b3 = new Bag("Lotto " , 3 ,9);
	    Bag b4 = new Bag("Adidas " , 10 ,12);
		
		Bag Bags[] = new Bag [4];
		Bags[0] = b1;
		Bags[1] = b2;
		Bags[2] = b3;
		Bags[3] = b4;
		
		System.out.println();
		for (int i= 0 ; i<Bags.length ; i++){
		
		Bags[i].showDetils();
		System.out.println();
		}
  } 
}