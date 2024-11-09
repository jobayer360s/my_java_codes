import java.lang.*;
//...
    public class BookShop{
	private String name;
	
	private TextBook textBooks[]= new TextBook[100];
	private StoryBook storyBooks[] = new StoryBook[100];
	
	
	public BookShop(){}
	public BookShop(String name){
		this.name = name;
	}
	public void setName(String name) {
		this.name =name;
		
	}
	
	public String getName(){
		return this.name;
	}
	
	public boolean insertTextBook(TextBook tb){
		boolean flag = false;
		for(int i=0; i<textBooks.length; i++){
			if(textBooks[i] == null){
				textBooks[i]= tb;
				flag =true;
				break;
			}
		}
		if(flag == true){
			System.out.println("Text Book inserted ");
			return true ;
		}
		else{
			System.out.println("Text Book insert failed ");
				return false ;
		}
	}
	
	public boolean removeTextBook(TextBook tb){
		boolean flag = false ;
		for(int i=0; i<textBooks.length; i++){
			if(textBooks[i] != null){
			textBooks[i] = null ;
				flag = true;
				break;
			}
		}
		
		if(flag == true){
			System.out.println("Text Book removed ");
			return true;
		}
		else{
			System.out.println("failed to remove TextBook");
			return false;
		}
	}
	
	public void showAllTextBooks(){
		for(int i=0; i<textBooks.length; i++){
			if(textBooks[i]!=null){
			System.out.println("Text Book "+(i+1)+" Information is ");
			System.out.println("Name : " + this.getName());
			System.out.println("Stardard is : "+textBooks[i].getStandard()); 
			textBooks[i].showDetails();
			System.out.println();
			}
		}
	}
	
	
	//story book part
	
	public boolean insertStoryBook(StoryBook sb)
	{
		boolean flag = false;
		for(int i=0; i<storyBooks.length; i++){
			if(storyBooks[i] == null){
				storyBooks[i]= sb;
				flag =true;
				break;
			}
		}
		if(flag == true){
			System.out.println("Story Book inserted ");
			return true ;
		}
		else{
			System.out.println("failed to insert story Books ");
				return false ;
		}
	}
	
	
	    public boolean removeStoryBook(StoryBook sb){
		boolean flag = false ;
		for(int i=0; i<storyBooks.length; i++){
			if(storyBooks[i] != null){
			storyBooks[i] = null ;
				flag = true;
				break;
			}
		}
		
		if(flag == true){
			System.out.println("Story Book removed ");
			return true;
		}
		else{
			System.out.println("Failed to remove Story Book");
			return false;
		}
	}

   public void showAllStoryBooks(){
		for(int i=0; i<storyBooks.length; i++){
			if(storyBooks[i]!= null){
			System.out.println("Story Book "+(i+1)+" information is ");
			System.out.println("Name : " + this.getName());
			System.out.println("Category is : " +storyBooks[i].getCategory());
			storyBooks[i].showDetails();
			System.out.println();
			}
		}
	} 
	
}
