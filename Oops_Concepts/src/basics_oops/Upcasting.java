package basics_oops;

class Mother {
	
	void cook() {
		System.out.println("the mother is cooking....");
	}
	
	void earn() {
		System.out.println("the mother is earning....");
	}
}

class Son extends Mother {
	
	void earn() {
		System.out.println("the son is earning....");
	}
	
	void game() {
		System.out.println("the son is playing games....");
	}
}

//creating the child's object with parent class reference.
public class Upcasting {

	public static void main(String[] args) {
		
		Mother mother = new Mother();
		mother.cook();
		mother.earn();
		System.out.println("*****************************");
		
		Son son = new Son();
		son.earn();
		son.game();
		System.out.println("*****************************");
		
		Mother m = new Son();
		m.cook(); // parent specific method accessible , because ref is parent here.
		m.earn(); // Overridden methods accessible , but child's method is preferred (same as overriden method)
		
		// m.game();  child's Specific methods are not accessible , during the upcasting
		
	}

}
