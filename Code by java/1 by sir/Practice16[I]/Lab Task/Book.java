import java.lang.*;
public class Book{
	private String isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;
	
	public Book(){}
	public Book(String isbn, String bookTitle, String authorName, double price,int availableQuantity){
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
	}
	
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	public void setBookTitle(String bookTitle){
		this.bookTitle = bookTitle;
	}
	public void setAuthorName(String authorName){
		this.authorName = authorName; 
	}
	public void setPrice(double price){
		this.price = price;
	}
	public void setAvailableQuantity(int availableQuantity){
		this.availableQuantity = availableQuantity;
	}
	
	public String getIsbn(){
		return isbn;
	}
	public String getBookTitle(){
		return bookTitle;
	}
	public String getAuthorName(){
		return authorName;
	}
	public double getPrice(){
		return price;
	}
	public int getAvailableQuantity(){
		return availableQuantity;
	}
	
	
	public void addQuantity(int amount){
		int quantityAdded = availableQuantity + amount;
		System.out.println("Quantity Added: "+quantityAdded);
	}
	public void sellQuantity(int amount){
		int quantitySell = availableQuantity - amount;
		System.out.println("Quantity Sell: "+quantitySell);
	}
	
	public void showDetails(){
		System.out.println("ISBN: "+isbn);
		System.out.println("Book Title: "+bookTitle);
		System.out.println("Author Name: "+authorName);
		System.out.println("Price: "+price);
		System.out.println("Available Quantity: "+availableQuantity);
		//System.out.println("Add Quantity: "+addQuantity());
		//System.out.println("Sell Quantity: "+sellQuantity());
	}
	
}