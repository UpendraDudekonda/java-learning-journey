package encapsulation;

class Cname {
	
	//private for accessible only within the class
	//static for accessible inside the static method	
	private static Cname instance;
	
	
	//private constructor , for not create the obj outside the class
	private Cname() {
		
	}
	
	public static Cname getInstance() {
		
		if(instance == null) {
			instance = new Cname(); // we have private constructor , so we can create inside the same class
		}
		
		return instance;
	}
	
	public void displayStatus() {
		System.out.println("singleton method called successfully!!");
	}
	
}

public class SingletonDP {

	public static void main(String[] args) {
		
		Cname ref1 = Cname.getInstance();
		ref1.displayStatus();
		
		System.out.println(ref1);
		
		Cname ref2 = Cname.getInstance();
		ref2.displayStatus();
		
		System.out.println(ref2);

	}

}

//Output
//singleton method called successfully!!
//encapsulation.Cname@6b143ee9
//singleton method called successfully!!
//encapsulation.Cname@6b143ee9

