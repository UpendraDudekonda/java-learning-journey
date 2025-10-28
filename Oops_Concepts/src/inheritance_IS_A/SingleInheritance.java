package inheritance_IS_A;

class Vehicle {
	
	void start() {
		System.out.println("the vehicle starting.....");
	}
}

class Car extends Vehicle {
	
	void honk() {
			System.out.println("the car horn.....");
	
	}
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.start(); // all the variables and methods are came into Car // inherited method
		car.honk(); // child specific method
		

	}

}
