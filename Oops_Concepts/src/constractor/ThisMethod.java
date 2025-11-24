package constractor;

class Test {
	
	Test() {
		this(2500); // this always refers to current class object and this method use to class the another constructor of same class.
		System.out.println("default constructor...");
		
	}
	
	Test(int x) {
		System.out.println("parametarized  constructor :" + x);
	}
}

public class ThisMethod {

	public static void main(String[] args) {
		

		Test test = new Test();
		
	}

}

//output
//parametarized  constructor :2500
//default constructor...

