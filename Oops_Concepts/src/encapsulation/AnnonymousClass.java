package encapsulation;

//Class without a name 
//Used for one-time implementation
//Mostly used to override methods of abstract class/interface
//One-time override, especially for callbacks

interface Animal {
	void sound();
}

abstract class Vehicle {
	abstract void horn();
}

public class AnnonymousClass {

	public static void main(String[] args) {
		
		Animal dog = new Animal() {

			@Override
			public void sound() {
				
				System.out.println("dog barks...");
			}
			
		};
		dog.sound();
		
		Vehicle bicycle =  new Vehicle() {
			
			@Override
			void horn() {
				
				System.out.println("bicycle rings the bell...");
			}
		};
		
		bicycle.horn();

	}

}
//output
//dog barks...
//bicycle rings the bell...
