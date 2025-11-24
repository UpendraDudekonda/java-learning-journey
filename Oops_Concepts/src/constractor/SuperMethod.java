package constractor;

 class Parent1 {
	Parent1() {
		System.out.println("parent constructor.");
	}
	
	void display() {
		System.out.println("the father shiva has all power to take control.");
	}
}

class Child1 extends Parent1{
	
	Child1() {
		super(); // super() method calls the parent constructor
		System.out.println("child constructor.");
	}
	
	@Override
	void display() {
		
		super.display(); // with keyword we can call the super class methods
		
		System.out.println("the child ganaesh have power to bring obstacles.");
	}
}

public class SuperMethod {

	public static void main(String[] args) {
		
		new Child1().display();

	}

}

//output
//parent constructor.
//child constructor.
//the father shiva has all power to take control.
//the child ganaesh have power to bring obstacles.
