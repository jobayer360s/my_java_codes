import java.lang.*;
public class StoryBook extends Book{
    private String category;

public StoryBook( ) {}

public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category) {
    super( isbn, bookTitle, authorName, price, availableQuantity);
    this.category = category;

}
public void setCategory(String category) {
    this.category = category;
}
public String getCategory(){
    return this.category;
} 

public void showDetails( ){
  System.out.println("ISBN is "+getIsbn());
  System.out.println("Book tittle is "+getBookTitle());
  System.out.println("Author name is "+getAuthorName());
  System.out.println("Price is"+getPrice());
  System.out.println("Availeable quantity is "+getAvailableQuantity());
  System.out.println("Category is "+getCategory());
  System.out.println();
}

}
