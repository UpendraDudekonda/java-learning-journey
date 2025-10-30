package polymorphism;

class Robot {
	
	void learn() {
		System.out.println("robot is learning...");
	}
	
	void task() {
		System.out.println("robot is doing the task...");
	}
	
	
	void charge() {
		System.out.println("Robot is charging...");
	}
}

class CleaningRobot extends Robot {
	
	void learn() {
		System.out.println("the cleaning robo is learning how to clean..");
	}
	
	void task() {
		System.out.println("the robot is cleaning the floor");
	}
}

class TeacherRobot extends Robot {
	
	void learn() {
		System.out.println("the teacher robot lerarning how to teach...");
	}
	
	void task() {
		System.out.println("the teacher robot is teacher the class...");
	}
}

public class CompletePolymorphism {

	public static void main(String[] args) {
		
		CleaningRobot robo1 = new CleaningRobot();
		manageRobot(robo1);
		
		TeacherRobot robo2 = new TeacherRobot();
		manageRobot(robo2);

	}
	
	public static void manageRobot(Robot robo ) {
		
		robo.charge();
		robo.learn();
		robo.task();
		System.out.println("********************************************");
		
	}

}
