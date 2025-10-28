package basics_oops;
// members of the class (6 types static variables, static blocks, static methods and non-static variables
// non-static blocks and non-static methods
// static variables are stored in the static memory (static memory, stack memory and heap memory) 
// jvm statrt execution from main method, so static variables are assaigned before jvm start execution 


class Demo {
	
	//Static variables
	static int a;
	static int b;
	
	
	//Static block
	static {
		a =10;
		b =20;
		
	}
	
	// static methods
	static void display() {
		System.out.println(a);
		System.out.println(b);
	}
	
	//non-Static variables
	int p;
	int q;
	
	//non-Static block
	{
		p = 2;
		q = 4;
	}
	
	// non-static method
	void display1() {
		System.out.println(p);
		System.out.println(q);
	}
	
}

public class StaticAndNonstatic {

	public static void main(String[] args) {
	
		
		// we can directly access the the static variables by help of class name, no object creation is required
		System.out.println("Static variables a : " + Demo.a);
		System.out.println("Static variables b : " + Demo.b);
		
		Demo.display();
		
		
		// for accessing the non static members we must create the object
		Demo demo = new Demo();
		
		System.out.println("Non static varibles p :" + demo.p);
		System.out.println("Non static varibles q :" + demo.q);
		
		demo.display1();

	}

}
