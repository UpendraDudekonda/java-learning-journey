package inheritance_IS_A;

class GrandFather {

	void displayGrandFather() {
		System.out.println("I am grand father....");
	}
}

class Father extends GrandFather{
	
	void displayFather() {
		System.out.println("I am father....");
	}
}

class Child extends Father{
	 void displayChild() {
		 System.out.println("I am child....");
	 }
}

// child class inherited all the properties and behaviors from parent class , at the same time, this class acts as the parents  for another child class , called multi-level-inheritance. 
public class MultiLevel {

	public static void main(String[] args) {
		
		Child child  =  new Child();
		
		child.displayChild(); // child specific
		child.displayFather(); // inherited from father 
		child.displayGrandFather(); // inherited from father, father inherited from grandFather

	}

}
