import java.lang.*;
public class Start 
{
	public static void main(String[] args)
	{
		Book b1 = new Book("ab-1", "Book a", "Mr b A ", 100.5, 300);
		b1.showDetails();
		b1.addQuantity(100);
		b1.sellQuantity(50);
		System.out.println(b1.getAvailableQuantity());
		System.out.println();
		
		//story book part
		StoryBook sb1 = new StoryBook("STB100","Story Book A", "MR sb a", 110, 500,"Child ");
		System.out.println(sb1.getCategory());
		System.out.println();
		
		StoryBook sb2 = new StoryBook("STB101","Story Book B", "MR sb b", 110, 520,"Teen ");
		System.out.println(sb2.getCategory());
		System.out.println();
		
		StoryBook sb3 = new StoryBook("STB1002","Story Book D", "MR sb c", 110, 550,"Adult ");
		sb3.setCategory("Child");//*****
		System.out.println(sb3.getCategory());
		System.out.println();
		
		StoryBook sb4 = new StoryBook("STB1003","Story Book D1", "MR sb a", 110, 700,"senior ");
		System.out.println(sb4.getCategory());
		System.out.println();
		
		StoryBook sb5 = new StoryBook("STB1004","Story Book L", "MR sb a", 110, 200,"Child ");
		System.out.println(sb5.getCategory());
		System.out.println();
		
		StoryBook sb6 = new StoryBook("STB10044F","Story Book za", "MR sb za", 1100, 2010,"Child ");
		System.out.println(sb6.getCategory());
		System.out.println();
		
		
		//text book part
		System.out.println();
		TextBook tb1 = new TextBook("TB1001","Text Book a","Mr Tb a" , 130, 900 ,1000);
        System.out.println(tb1.getStandard());
		
		System.out.println();
		TextBook tb2 = new TextBook("TB1002","Text Book B","Mr Tb B" , 140, 700 ,9900);
		tb2.setStandard(750);//********
        System.out.println(tb2.getStandard());
		
		System.out.println();
		TextBook tb3 = new TextBook("TB1003","Text Book C","Mr Tb C" , 1400, 1800 ,1900);
        System.out.println(tb3.getStandard());
		
		System.out.println();
		TextBook tb4 = new TextBook("TB1004","Text Book D","Mr Tb E" , 320, 400 ,300);
        System.out.println(tb4.getStandard());
		
		System.out.println();
		TextBook tb5 = new TextBook("TB1005","Text Book E","Mr Tb F" , 130, 900 ,1000);
        System.out.println(tb5.getStandard());
		TextBook tb6 = new TextBook("TB1005F","Text Book Z","Mr Tb Z" , 130, 900 ,99900);
		
		
	
		
		System.out.println();
		BookShop bs1 = new BookShop("kamal Book shop ");
		
		
		bs1.insertStoryBook(sb1);
		bs1.insertStoryBook(sb2);
		bs1.insertStoryBook(sb3);
		bs1.insertStoryBook(sb4);
		bs1.insertStoryBook(sb5);		
		bs1.showAllStoryBooks();
		System.out.println();
		bs1.removeStoryBook(sb5);
		
		
		bs1.insertTextBook(tb1); 
		bs1.insertTextBook(tb2);
		bs1.insertTextBook(tb3);
		bs1.insertTextBook(tb6);
		bs1.insertTextBook(tb4);
		bs1.insertTextBook(tb5);
		bs1.showAllTextBooks(); 
		bs1.removeTextBook(tb3);
		
		BookShop bs2 = new BookShop();
		bs2.setName("quadeer Book Shop ");
		System.out.println(bs2.getName());
		bs2.insertStoryBook(sb5);
		bs2.insertTextBook(tb3);
		bs2.showAllStoryBooks();
		bs2.showAllTextBooks();
		
	}
}




/*The start class contains the main method. Inside the main method, create five objects of TextBook, 
five objects of StoryBook and one object of BookShop. Demonstrate all the methods and 
constructors.*/

