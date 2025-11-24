package abstraction;

abstract class Vehicle {
	
	abstract void start();
	
	void stop() {
		System.out.println("the vehicle stoped here...");
	}
}

class Car extends  Vehicle {

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("the car start with an ingnition...");
	}
	
}

class Bike extends Vehicle {

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("the bike start with an key or self-start...");
	}
	
}

class Bus extends Vehicle {
	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("the bus start with an ignition...");
	}
}

class Train extends Vehicle {
	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("the Train start with an push button for ignition...");
	}
}

public class AbtractVehicle {

	public static void main(String[] args) {
		
		//Vehicle veh = new Vehicle(); Cannot instantiate the type Vehicle 
										//we can't create the obj for the abstract class
		
		Vehicle veh1 = new Bike(); //upcasting
		bookVehicle(veh1);
		
		Vehicle veh2 = new  Bus();
		bookVehicle(veh2);
		
		Vehicle veh3 = new Car();
		bookVehicle(veh3);
		
		Vehicle veh4 = new Train();
		bookVehicle(veh4);
	}
	
	public static void bookVehicle(Vehicle vehicle) {
		vehicle.start();
		vehicle.stop();
		
		System.out.println("**********************");
	}

}

//output

//the bike start with an key or self-start...
//the vehicle stoped here...
//**********************
//the bus start with an ignition...
//the vehicle stoped here...
//**********************
//the car start with an ingnition...
//the vehicle stoped here...
//**********************
//the Train start with an push button for ignition...
//the vehicle stoped here...
//**********************
