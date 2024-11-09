import java.lang.*;
import java.util.*;

public class Start{

	
	public static void main (String [] args)
	{
		Book b1 = new Book();
	    b1.setIsbn("Abc123");
        b1.setBookTitle("learn java ");
        b1.setAuthorName("Hobert schild");
        b1.setPrice(250.1);
        b1.setAvaiableQuantity(60);
        
		
		System.out.println( b1.getIsbn());
        System.out.println( b1.getBookTitle());
        System.out.println( b1.getAuthorName());
        System.out.println(b1.getPrice());
        System.out.println(b1.getAvailableQuantity());
		b1.showDetails();
		
		System.out.println();
		System.out.println("After adding 50");
		b1.addQuantity(50);
		System.out.println(b1.getAvailableQuantity());
		System.out.println("After selling 15");
		b1.sellQuantity(15);
		System.out.println(b1.getAvailableQuantity());
		
		
		Book b2 = new Book("BCD", "Jvaava 2","ahmed roy ", 500, 50);
	    Book b3 = new Book("EFG", "Jvaava 3","Jibon roy ", 400, 60);
		Book b4 = new Book("HIJ", "Jvaava 4","Jesmin roy ", 300, 700);
        Book b5 = new Book("KLM", "Jvaava 5","ada lovelace roy ", 900, 150);
		
		Book Books[] = new Book [5];
		Books[0] = b1;
		Books[1] = b2;
		Books[2] = b3;
		Books[3] = b4;
		Books[4] = b5;
		
		
		for(int i =0 ; i<Books.length ; i++)
		{
			if(Books[i] != null ){
			System.out.println();
			Books[i].showDetails();}
			
			else{
				System.out.println("No books found");
			}
		}
		
	}
	
	
}