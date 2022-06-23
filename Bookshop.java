package oops.java;
 
class Book{
	
	int length;
	int breadth;
	String author;
	int amount;
	
	
} 
class note{
	
	 int length;
	 String color;
	 int size;
	 int amount;
}
public class Bookshop {

	public static void main(String[] args) {
		// TODO Auto-generated method  
		
		Book Richdad;
		Richdad = new Book();
		
		Richdad . length = 12 ;
		Richdad . breadth = 8 ;
		Richdad . author = "sandeep" ;
		Richdad . amount = 120 ;
		
		
		note longsize;
		longsize = new note();
		
		longsize .length = 8 ;
		longsize .color = "white";
		longsize .size = 6 ;
		longsize .amount = 65;
		
	
		
		 Book PositiveThinking ;
		 PositiveThinking  = new Book();
		 
		 PositiveThinking . length  = 10 ;
		 PositiveThinking . breadth = 8 ;
		 PositiveThinking . author  = "Norman Vincent Peale" ;
		 PositiveThinking . amount  = 500 ;
		
		
		 System.out.println( " Richdad . length  : "  + Richdad. length);
		 System.out.println( " Richdad . breadth : "  + Richdad. breadth);
		 System.out.println( " Richdad . arthor  : "  + Richdad. author);
		 System.out.println( " Richdad . height  : " + Richdad. amount);
		 
		 System.out.println( " print the positivethinking book details\n");
		
		 System.out.println( " PositiveThinking . length  : "   + PositiveThinking. length);
		 System.out.println( " PositiveThinking . breadth : "   + PositiveThinking. breadth);
		 System.out.println( " PositiveThinking . arthor  : "   + PositiveThinking. author);
		 System.out.println( " PositiveThinking . height  : " + PositiveThinking. amount );
		 
		 System.out.println( " print the longsize details\n");
		 
		      
		 System.out.println( " longsize . length : "  + longsize. length);
		 System.out.println( " longsize . color : "  + longsize.color);
		 System.out.println( " longsize . size  : "  + longsize. size);
		 System.out.println( " longsize . height  : " + longsize. amount);
	 
	}

}
