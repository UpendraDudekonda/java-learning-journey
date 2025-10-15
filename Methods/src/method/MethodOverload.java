package method;

public class MethodOverload {

	public static void main(String[] args) {
		
		double circle = calArea(1.9);
		
		System.out.println("the are of circle is :" + circle);
		
		double sqre = calArea(10);
		
		System.out.println("the are of square is :" + sqre);
		
		double rectangle = calArea(10,5);
		
		System.out.println("the are of rectangle is :" + rectangle);
		

	}
	
	static double calArea(int s) {
		return s * s;
	}
	
	static double calArea(int l, int b) {
		return  0.5 * l * b;
	}
	
	static double calArea(double r) {
		return 3.14 * r * r ;
	}

}
