public class Start 
{
	public static void main(String[] args)
	{
		System.out.println("Story book 1 ");
		StoryBook sb1 = new StoryBook();
	    sb1.setIsbn("NRt1212");
        sb1.setBookTitle("Naruto");
        sb1.setAuthorName("Uzumaki Naruto.");
        sb1.setPrice(100);
        sb1.setAvaiableQuantity(400);
		 
		System.out.println("(get)Isbn is " +sb1.getIsbn());
		System.out.println("(get)Tittle is " +sb1.getBookTitle());
		System.out.println("(get)Author is " +sb1.getAuthorName());
		System.out.println("(get)price is " +sb1.getPrice());
		System.out.println("(get) Available quantity is " +sb1.getAvailableQuantity());
		
		System.out.println("After adiing 200 pics ");		
		sb1.addQuantity(200);
		System.out.println(sb1.getAvailableQuantity());	
		 
		System.out.println("After selling 300 pics ");
        sb1.sellQuantity(300);	 
		System.out.println(sb1.getAvailableQuantity());
		
		System.out.println();
		
		System.out.println("book 2 ");
		StoryBook sb2 = new StoryBook("TnJ ", "Tom and jerry a legend ", " Joshep Barbera", 100 , 500 ,"Child");
		sb2.showDetails();
		
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("Text book 1");
		TextBook tb1 = new TextBook("0045NCTB1", "English for Today", "NCTB Bangladedesh", 100, 5000, 456);
		tb1.showDetails();
		
		System.out.println();
		System.out.println("Text book 2");
		TextBook tb2 = new TextBook();
		tb2.setStandard(1000);
		System.out.println("(get) Standard "+tb2.getStandard());
	}
}