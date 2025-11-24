package encapsulation;

// the inner class present inside the method of outer class, called local inner class.
//the inner class defining, object creation, and accesing can be scope of that method only.
//most security cases.
class localOuter {
	
	//method of the outer class	
	void localMethod() {
		
		final String message = "This is local outer class";
		
		// class present inside the method of outer class
		class Inner {
			
			void showlocal() {
				System.out.println(message);
			}
			
		}
		
		// the object of inner class also present inside the metjod of outer class 
		Inner lic = new Inner();
		
		//accesing also present in the same method
		lic.showlocal();
	}
	
}

public class LocalInnerClass {

	public static void main(String[] args) {
		
		localOuter outer =  new localOuter();
		
		outer.localMethod();
		
		//output
		//This is local outer class
	}

}
