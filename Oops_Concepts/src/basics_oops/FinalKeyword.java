package basics_oops;

final class FinalClassExample {
	
	void display() {
		System.out.println("the is from final class....");
	}
}


//The type NextClass cannot subclass the final class FinalClassExample [Compile time error].
//class NextClass extends FinalClassExample {
//	
//}

class SuperClass {
	
	final int MAX_SPEED = 150;
	
	void displaySpeed() {
		// MAX_SPEED = 100; "The final field SuperClass.MAX_SPEED cannot be assigned"
		System.out.println("the speed is  " + MAX_SPEED);
		
	}
	
	final void displayFinalMethod() {
		
		System.out.println("this is final method.....");
	}
	
}

class SubClass extends SuperClass {
	
//	void displayFinalMethod() {
//		Cannot override the final method from SuperClass [compile time error]
//	}
	
	void displaySubClass() {
		System.out.println("this is sub class method");
	}
}


// final keyword restrict the class , methods and variables.
// final class , cannot be extends (no inheritance)
// final method , cannot be overriden
//final variables cannot be changed
public class FinalKeyword {

	public static void main(String[] args) {
		
		FinalClassExample classExample =new FinalClassExample();
		classExample.display();
		System.out.println("*****************************************");
		
		
		SuperClass class1 = new SuperClass();
		class1.displayFinalMethod();
		class1.displaySpeed();
		System.out.println(class1.MAX_SPEED);
		System.out.println("*****************************************");
		
		SubClass class2 = new SubClass();
		class2.displaySubClass();
		class2.displayFinalMethod();
		class2.displaySpeed();
		
		System.out.println(class2.MAX_SPEED);
		System.out.println("*****************************************");
	}

}
