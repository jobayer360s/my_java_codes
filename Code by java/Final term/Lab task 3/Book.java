import java.lang.*;

public abstract class Book implements BookOperation{
   private String isbn; 
   private String bookTitle ;
   private String authorName ;
   private double price ;
   private int availableQuantity;
	
   Book( ) {}
   Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity)
     {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
     }

    public void setIsbn(String isbn)
    {
        this.isbn=isbn;
    } 
    public void setBookTitle(String bookTitle) {
         this.bookTitle = bookTitle;

    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setAvaiableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;

    }
    public String getIsbn( ) {
        return this.isbn;
    }
    public String getBookTitle( ) {
        return this.bookTitle;
    }
    public String getAuthorName( ) {
        return this.authorName;
    }
    public double getPrice( ) {
        return this.price;
    }
    public int getAvailableQuantity( ) {
        return this.availableQuantity;
    }
    
    public void addQuantity(int amount) {
        availableQuantity = availableQuantity + amount;
        	System.out.println(amount +" books added " );
    }
    public void sellQuantity(int amount) 
    {
        availableQuantity  = availableQuantity - amount;
		System.out.println(amount +" books sold " );
    }
    
    public abstract void showDetails( );

}