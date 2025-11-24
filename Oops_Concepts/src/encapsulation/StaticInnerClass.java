package encapsulation;

//A static class present inside the Outer class called the static inner class
// we can directly create the inner class object , by using the class name {due to static class}
//OuterClass.InnerClass ic = new OuterClass.innerClass();
//best memory efficient way for inner class type
class OuterClass {
	
	private static String message = "This is from outer class";
	
	static class InnerClass {
		
		void show() {
			
			System.out.println(message);
		}
	}
}

public class StaticInnerClass {

	public static void main(String[] args) {
		
		//directly we create the inner class object with class name {OuterClass}
		OuterClass.InnerClass ic = new OuterClass.InnerClass();
		
		ic.show();
		
	}

}

//output
//This is from outer class
