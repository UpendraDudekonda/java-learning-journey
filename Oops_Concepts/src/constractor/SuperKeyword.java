package constractor;

class Parent {
	String name ="parent member";
}

class Child extends Parent{
	String name = "child member";
	
	void show() {
		System.out.println(name);
		System.out.println(super.name); // super always refers to parent class
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
	
		new Child().show();
	}

}
//output
//child member
//parent member
