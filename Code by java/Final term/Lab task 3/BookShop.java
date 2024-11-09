public class BookShop implements BookShopOperation {
   private String name ;
   private Book listOfBooks[] = new Book[100]; //size of array should be 100. 
    BookShop( ){} 
    public BookShop(String name) {
        this.name = name;
    }
    public void setName(String name) {
         this.name = name;
    }
    public String getName( ) {
        return this.name;
    }

    public boolean insertBook(Book b) {
        boolean flag = false;
        for(int i =0; i<listOfBooks.length; i++){
           if (listOfBooks[i] == null) {
            listOfBooks[i]= b;
            flag = true;
            break;
            
           }
        }
        
        if(flag == true){
            System.out.println("Book inserted ");
            return true;
        }
        else{
            System.out.println("Failed to insert Book ");
            return false;
        }

    }
    public boolean removeBook(Book b) {
        boolean flag = false ;
		for(int i=0; i<listOfBooks.length; i++){
			if(listOfBooks[i] != null){
			listOfBooks[i] = null ;
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
    public void showAllBooks( ) {
        for(int i=0; i<listOfBooks.length; i++){
			if(listOfBooks[i]!=null){
            System.out.println("Name : " + this.getName());
			System.out.println("Book "+(i+1)+" Information is "); 
			listOfBooks[i].showDetails();
			System.out.println();
			}
		}

    }

   public Book searchBook(String isbn) 
   {
       Book result = null;
       for(int i=0; i<listOfBooks.length; i++)
       {
           if(listOfBooks[i] != null && listOfBooks[i].getIsbn() == isbn)
           {
               
               result = listOfBooks[i];
           }
       }
       return result;
   }


}
