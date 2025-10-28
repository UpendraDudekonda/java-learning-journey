package basics_oops;

class Employee {
	
	void work() {
		System.out.println("Employee is working...");
	}
	
	void attendMeeting() {
		System.out.println("Employee is attending a meeting...");
	}
}

class Manager extends Employee {
	
	// void work() -> inherited method
	
	@Override      // override method
	void attendMeeting() {
		System.out.println("Manager is leading the meeting...");
	}
	
	
	//child specific method
	void conductReview() {
		System.out.println("manager is conducting the performance review....");
	}
}

public class TypesOfMethods {

	public static void main(String[] args) {
		
		Manager manager  =  new Manager();
		
		manager.work();				//inherited method
		manager.attendMeeting();	// override method
		manager.conductReview();	//child specific method

	}

}
