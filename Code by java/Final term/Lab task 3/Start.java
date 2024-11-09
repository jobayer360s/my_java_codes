public class Start {
    public static void main(String[] args) {
        StoryBook sb1 = new StoryBook("STB001", "Tom and Jerry", "Jerry Beck", 10000, 10000, "child");
        sb1.sellQuantity(500);
        StoryBook sb2 = new StoryBook();
        sb2.setIsbn("STB002");
        sb2.setBookTitle("Ben 10");
        sb2.setAuthorName("wayne McDuffie");
        sb2.setAvaiableQuantity(500);
        sb2.setCategory("Young");
        StoryBook sb3 = new StoryBook("STB003", "Oggy and Cochroces ", "Xlaim", 100, 180, "child");
        StoryBook sb4 = new StoryBook("STB004", "Mina & raju ", "unesc0", 50, 1300, "kids");
        sb4.addQuantity(100);
        StoryBook sb5 = new StoryBook("STB005", "Motu and Patlu", "Colors ent.", 140, 1000, "child");
       
       
       TextBook tb1 = new TextBook();
        tb1.setIsbn("TXB001");
        tb1.setBookTitle("Bangla");
        tb1.setAuthorName("NCTB");
        tb1.setAvaiableQuantity(850);
        tb1.setStandard(10);

        TextBook tb2 = new TextBook("TXB002", "Math for kids", "Primary education board", 90, 110, 20);
        TextBook tb3 = new TextBook("TXB003", "Islamic education", "Islamic Foundation", 60, 1990, 25);
        TextBook tb4 = new TextBook("TXB004", "Scince learning", "NCTB-bd", 190, 1880, 24);
        TextBook tb5 = new TextBook("TXB005", "Social science ", "NCTB bangla ", 100, 40, 21);
       
       
       
       
        BookShop bs1 = new BookShop("Dhaka Book store");
        bs1.insertBook(sb1);
        bs1.insertBook(sb2);
        bs1.insertBook(sb3);
        bs1.insertBook(sb4);
        bs1.insertBook(sb5);
        
        bs1.insertBook(tb1);
        bs1.insertBook(tb2);
        bs1.insertBook(tb3);
        bs1.insertBook(tb4);
        bs1.insertBook(tb5);
        
        bs1.removeBook(tb5);

        bs1.showAllBooks();

        System.out.println();
        
        if(bs1.searchBook("TXB002") != null)
		{
			System.out.println("Found!");
			bs1.searchBook("TXB002").showDetails();
		}
		else
		{
			System.out.println("Not found!");
		}

        
        if(bs1.searchBook("TXB007") != null)
		{
			System.out.println("Found!");
			bs1.searchBook("TXB007").showDetails();
		}
		else
		{
			System.out.println("Not found!");
		}


    }
}
