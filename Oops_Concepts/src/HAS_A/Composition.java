package HAS_A;

class Chapter {
	
	String title;
	String author;
}

class Book {
	
	Chapter chapter = new Chapter();
}


//the relationship between objs have 2 types , has-a(aggregation and composition) and is-a (inheritance)
//aggregation is weekly coupled between objects [mobile has a charger].may exist independently
//composition is strong coupled between objects [mobile has a os]. can't exist independently.
//the book  has-A  chapter.
public class Composition {

	public static void main(String[] args) {
		
		Book book = new Book();
		
		book.chapter.title = "The Secret";
		book.chapter.author = "Ronda Byre";
		
		System.out.println("I am reading the book with Title: " + book.chapter.title);
		System.out.println("the book was written by " + book.chapter.author);
		

	}

}
