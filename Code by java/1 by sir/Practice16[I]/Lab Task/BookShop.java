import java.lang.*;
public class BookShop{
	private String name;
	private TextBook textBooks[] = new TextBook[100];
	private StoryBook storyBooks[] = new StoryBook[100];
	
	public BookShop(){}
	public BookShop(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public boolean insertTextBook(TextBook tb){
		boolean textBookInsert = false;
		for(int i=0; i<textBooks.length; i++) // textBook.length = 5
		{
			if(textBooks[i] == null)
			{
				textBooks[i] = tb;
				textBookInsert = true;
				break;
			}
		}
		if(textBookInsert == true)
		{
			System.out.println("Inserted!");
			return true;
		}
		else
		{
			System.out.println("Can't insert!");
			return false;
		}
	}
	
	
	public boolean removeTextBook(TextBook tb){
		boolean textBookRemove = false;
		for(int i=0; i<textBooks.length; i++)
		{
			if(textBooks[i] == tb)
			{
				textBooks[i] = null;
				textBookRemove = true;
				break;
			}
		}
		return textBookRemove;
	}
	
	public TextBook searchTextBook(String isbn) 
	{
		TextBook result = null;
		for(int i=0; i<textBooks.length; i++)
		{
			if(textBooks[i] != null && textBooks[i].getIsbn() == isbn)
			{
				/*
				if(textBook[i].getIsbn() == isbn)
				{
					result = textBook[i];
				}*/
				result = textBooks[i];
			}
		}
		return result;
	}
	
	public boolean insertStoryBook(StoryBook sb){
		boolean storyBookInsert = false;
		for(int i=0; i<storyBooks.length; i++)
		{
			if(storyBooks[i] == null)
			{
				storyBooks[i] = sb;
				storyBookInsert = true;
				break;
			}
		}
		return storyBookInsert;
	}
	
	public boolean removeStoryBook(StoryBook sb){
		boolean storyBookRemove = false;
		
		for(int i=0; i<storyBooks.length; i++)  // storyBook.length = 5
		{
			if(storyBooks[i] == sb)
			{
				storyBooks[i] = null;
				storyBookRemove = true;
				break;
			}
		}
		return storyBookRemove;
	}
	
	public void showAllTextBook(){
		System.out.println("Book Shop name: "+name);
		for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] != null) {
                System.out.println("Text Book " + (i + 1) + " information:");
                textBooks[i].showDetails();
                System.out.println("Standar: " + textBooks[i].getStandard());
                System.out.println();
            }
        }
		
	}
	
	
	// Try to show the Removed Text Book Information
	/*for(int i=0; i<textBooks.length; i++)
		{
			if(insertStoryBook(textBooks[i]))
			{
				System.out.println("Text Book Inserted!");
				System.out.println("Text Book "+(i+1)+" information:");
				textBooks[i].showDetails();
				System.out.println();
			}
			else
			{
				System.out.println("Text Book removed!");
				System.out.println("Text Book "+(i+1)+" information:");
				textBooks[i].showDetails();
				System.out.println();
			}
        }
		*/
	
	
	public void showAllStoryBook(){
		System.out.println("Book Shop name: "+name);
		for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] != null) {
                System.out.println("Story Book " + (i + 1) + " information:");
                storyBooks[i].showDetails();
				System.out.println("Category: " + storyBooks[i].getCategory());
                System.out.println();
            }
		}
		
	}
	
	
	
	// Try to show the Removed Story Book Information
	/*for(int i=0; i<storyBook.length; i++)
		{
			if(insertStoryBook(storyBook[i]))
			{
				System.out.println("Story Book Inserted!");
				System.out.println("Story Book "+(i+1)+" information:");
				storyBooks[i].showDetails();
				System.out.println();
			}
			else
			{
				System.out.println("Story Book removed!");
				System.out.println("Story Book "+(i+1)+" information:");
				storyBooks[i].showDetails();
				System.out.println();
			}
        }
		*/
}