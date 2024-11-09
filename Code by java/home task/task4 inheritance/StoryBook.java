import java.lang.*;
import java.util.*;

public class StoryBook extends Book{
	private String category;
	
	
	StoryBook()
	{}
   public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity,String category)
	{
		super(isbn , bookTitle , authorName , price , availableQuantity);
		this.category = category;
	}
   public void setCategory(String category)
	{
		this.category = category ;
	}
   public String getCategory()
   {
	   return category;
   }

 public void showDetails( )
   {
	super.showDetails();
	System.out.println("category is "+category);
   }
	
}