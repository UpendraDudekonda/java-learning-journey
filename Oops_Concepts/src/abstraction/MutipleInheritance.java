package abstraction;

// for pure abstraction we got interface
//defautly all methods are abstract only
//all variables are public static final
// interface has , abtract method, default methos and static method

interface parent1 {
	
	void mother();
	
	default void parent() {
		System.out.println("yes , i am parent for him..");
	}
}

interface parent2 {
	void father();
}

class Child implements parent1, parent2 {
	
	@Override
	
	public void father() {
		// TODO Auto-generated method stub
		System.out.println("aquired some qualities from the father..");
	}
	
	@Override
	public void mother() {
		// TODO Auto-generated method stub
		System.out.println("aquired some qualities from the mother..");
	}
}

public class MutipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child ch = new Child();
		ch.father();
		ch.mother();
		ch.parent();
	}
}
//output
//aquired some qualities from the father..
//aquired some qualities from the mother..
//yes , i am parent for him..
