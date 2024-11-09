public class TextBook extends Book {
    private int standard;

    TextBook(){} 
    TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard) {
        super( isbn, bookTitle, authorName, price, availableQuantity);
        this.standard = standard;
    }
   public void setStandard(int standard) {
      this.standard = standard;
   }
   public int getStandard( ){
    return this.standard;
   } 
   public void showDetails( ){
    System.out.println("ISBN is "+getIsbn());
    System.out.println("Book tittle is "+getBookTitle());
    System.out.println("Author name is "+getAuthorName());
    System.out.println("Price is"+getPrice());
    System.out.println("Availeable quantity is "+getAvailableQuantity());
    System.out.println("Standard is "+getStandard());
    System.out.println();
  }


}
