package basics_oops;

class Parent {
	
	public static void earn() {
		System.out.println("The parent is earning....");
	}
}

class Child extends Parent {
	
	public static void earn() {
		System.out.println("The child is earning....");
	}
}


//child's overridden static methods are hidden in upcasting.{static, overriden, upcasting)
public class MethodHiding {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		parent.earn();  // call parent's method
		// Parent.earn();	// static method can call through class name
		
		Child child =  new Child();
		child.earn(); // call child's method
		// Child.earn(); // static method can call through class name
		
		Parent p = new Child(); // upcasting 
		p.earn();  // child's method was hide because of static method.
	}

}
