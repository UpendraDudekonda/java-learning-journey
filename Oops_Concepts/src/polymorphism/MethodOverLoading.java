package polymorphism;

class Addition {
	
	void add(int a , int b) {
		System.out.println(a+b);
	}
	
	void add(int a, double b) {
		System.out.println(a+b);
	}
	
	void add(double a, int b) {
		System.out.println(a+b);
	}
	
	void add() {
		System.out.println(20+100);
	}
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
		
	}
	
}


// method in the same class having the same signature, but different in order of parameters, diff in number off parameters .
public class MethodOverLoading {

	public static void main(String[] args) {
		
		Addition ad = new Addition();
		
		ad.add(); 
		ad.add(10, 20);
		ad.add(1, 2, 3);
		ad.add(10, 10.25);
		ad.add(20.50, 10);
		
		
		
	
	}

}
