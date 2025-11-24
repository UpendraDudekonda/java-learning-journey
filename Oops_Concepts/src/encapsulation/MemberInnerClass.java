package encapsulation;

//A non-static class present inside the Outer class called the member inner class
// inner class object is created only with the help of outer class object's reference.
// OuterClass oc = new OuterClass()
//OuterClass.Innerclass ic = new oc.new InnerClass();

class Outer {
	
	private String message = "this is from outer class";
	
	//non-static inner class
	class Inner {
		
		void show() {
			System.out.println(message);
		}
		
	}
}

public class MemberInnerClass {

	public static void main(String[] args) {
		
		//step-1 : create the outer class object
		Outer oc = new Outer();
		
		//step-2 : then create the inner class object with help of outer class object's reference
		Outer.Inner ic = oc.new Inner();
		
		ic.show(); // then access the most private data

	}

}
// output
//this is from outer class