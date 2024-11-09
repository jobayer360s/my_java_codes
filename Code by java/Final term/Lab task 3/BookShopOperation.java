public interface BookShopOperation {
    public abstract boolean insertBook(Book b) ;
    public abstract boolean removeBook(Book b); 
    public abstract void showAllBooks( ); 
    public abstract Book searchBook(String isbn);
}
