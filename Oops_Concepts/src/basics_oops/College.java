package basics_oops;

// normal class 
class Student {
	
	//states (variables / instance variables)
	int id;
	String name;
	String phoneNumber;
	String branch;
	
	
	// Behaviors (methods) 
	void Study() {
		System.out.println("the student " + name + " with id : " + id + " is studying.");
	}
	
	void play() {
		System.out.println("the student " + name + " with id : " + id + " is playing football.");
	}
	
}


// main class where the student object is going to create
public class College {

	public static void main(String[] args) {
		
		Student s =  new Student(); // creating the object for that class
		
		// giving  the values by accessing through the object reference
		s.id = 59; 
		s.name = "upendra";
		s.phoneNumber = "6309756954";
		s.branch = "ECE";
		
		// calling the methods through the obj reference 
		
		System.out.println("The Student id is : "+s.id);
		System.out.println("The Student name is : "+s.name);
		System.out.println("The Student phone number is : "+s.phoneNumber);
		System.out.println("The Student Brance is : "+s.branch);
		
		System.out.println("*******************");
		s.Study();
		s.play();
		
	}

}
