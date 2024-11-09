import java.lang.*;
public class Start{
	
	public static void main(String[] args){
		
		TextBook tb01 = new TextBook();
		tb01.setIsbn("TB01");
		tb01.setBookTitle("Book Title - 01");
		tb01.setAuthorName("Durjoy Podder - 01");
		tb01.setPrice(100.45);
		tb01.setAvailableQuantity(200);
		tb01.setStandard(1);
		tb01.addQuantity(10);
		tb01.sellQuantity(50);
		TextBook tb02 = new TextBook("TB02", "Book Title-02", "Durjoy Podder-02", 100.2, 10, 2);
		TextBook tb03 = new TextBook("TB03", "Book Title-03", "Durjoy Podder-03", 100.2, 10, 3);
		TextBook tb04 = new TextBook("TB04", "Book Title-04", "Durjoy Podder-04", 100.2, 10, 4);
		TextBook tb05 = new TextBook("TB05", "Book Title-05", "Durjoy Podder-05", 100.2, 10, 5);
		
		
		
		/*
		StoryBook sb01 = new StoryBook();
		sb01.setIsbn("SB01");
		sb01.setBookTitle("Book Title - 01");
		sb01.setAuthorName("Durjoy Podder - 01");
		sb01.setPrice(100.45);
		sb01.setAvailableQuantity(10);
		sb01.setCategory("A");
		StoryBook sb02 = new StoryBook("SB02", "Book Title-02", "Durjoy Podder-02", 100.2, 10, "B");
		StoryBook sb03 = new StoryBook("SB03", "Book Title-03", "Durjoy Podder-03", 100.2, 10, "C");
		StoryBook sb04 = new StoryBook("SB04", "Book Title-04", "Durjoy Podder-04", 100.2, 10, "D");
		StoryBook sb05 = new StoryBook("SB05", "Book Title-05", "Durjoy Podder-05", 100.2, 10, "E");
		*/
		
		BookShop bs01 = new BookShop("SomSomMida");
		
		bs01.insertTextBook(tb01);
		bs01.insertTextBook(tb02);
		bs01.insertTextBook(tb03);
		bs01.insertTextBook(tb04);
		bs01.insertTextBook(tb05);
		
		if(bs01.searchTextBook("TB02") != null)
		{
			System.out.println("Found!");
			bs01.searchTextBook("TB02").showDetails();
		}
		else
		{
			System.out.println("Not found!");
		}
		//bs01.showAllTextBook();
		
		
		//bs01.removeTextBook(tb02);
		//bs01.showAllTextBook();
		
		/*
		
		
		bs01.insertStoryBook(sb01);
		bs01.insertStoryBook(sb02);
		bs01.insertStoryBook(sb03);
		bs01.insertStoryBook(sb04);
		bs01.insertStoryBook(sb05);
		bs01.showAllStoryBook();
		
		bs01.removeStoryBook(sb02);
		bs01.showAllStoryBook();*/
	}
}