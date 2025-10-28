package inheritance_IS_A;

class LibraryItem {
	
	void displayLibraryItem() {
		System.out.println("this is the library item...");
	}
}

class Book extends LibraryItem {
	void displayBook() {
		System.out.println("this is the book...."); // single inheritance
	}
}

class ScienceBook extends Book {
	void displayScienceBook() {
		System.out.println("this is the science book...."); // multi-level inheritance
	}
}

class Magazine extends LibraryItem {
	
	void displayMagazine() {
		System.out.println("this is the magazine.....");
	}
}

class Staff extends LibraryItem {
	
	void displayStaff() {
		System.out.println("this is the staff....."); // hierarchical inheritance
	}
	
}


//if the combination of 2 or more inheritance exist, then it is called the hybrid inheritance.
public class Hybrid {

	public static void main(String[] args) {
		
		System.out.println("***********************");
		ScienceBook sb = new ScienceBook();
		sb.displayScienceBook();
		sb.displayBook();
		sb.displayLibraryItem();
		
		System.out.println("***********************");
		
		Magazine mg = new Magazine();
		mg.displayMagazine();
		mg.displayLibraryItem();
		System.out.println("***********************");
		
		Staff sf = new Staff();
		sf.displayStaff();
		sf.displayLibraryItem();
		System.out.println("***********************");
	

	}

}
