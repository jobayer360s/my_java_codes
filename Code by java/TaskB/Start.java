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
        b1.getIsbn();
        b1.getBookTitle();
        b1.getAuthorName();
        b1.getPrice();
        b1.getAvailableQuantity();
		b1.showDetails();
		
		b1.addQuantity(50);
		b1.sellQuantity(15);
		
		b1.showDetails();
		
		Book b2 = new Book("BCD", "Jvaava 2","Jashone roy ", 500, 50);
		b2.showDetails();
	
	}
	
	
}