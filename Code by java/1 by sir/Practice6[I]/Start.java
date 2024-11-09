import java.lang.*;
import java.util.*;
public class Start
{
	public static void main(String[] args)
	{
		Box obj1 = new Box();
		obj1.setHeight(1);		
		obj1.setWeight(2);
		obj1.setLength(3);
		System.out.print(obj1.getHeight()+" "+obj1.getWeight()+" "+obj1.getLength());
		System.out.println();
		
		Box obj2 = new Box(4,5,6);
		System.out.print(obj2.getHeight()+" "+obj2.getWeight()+" "+obj2.getLength());
		System.out.println();
		
		Box boxes[] = new Box[10]; //size 10
		boxes[0] = obj1;
		boxes[1] = obj2;
		System.out.println(boxes[1].getWeight());
		
		System.out.println(); //adedByMe
		for(int i=0; i<boxes.length; i++)
		{
			if(boxes[i] != null)
			{
				System.out.print(boxes[i].getHeight()+" "+boxes[i].getWeight()+" "+boxes[i].getLength());
				System.out.println();
			}
			else
			{
				System.out.println("There is no object to show");
			}
		}
		
		
		
		
	}
}