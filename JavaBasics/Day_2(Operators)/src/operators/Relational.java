package operators;

public class Relational {

	public static void main(String[] args) {
		
		// ralational operators are used for comparision , gives True and False as output.
//		🧮 List of Relational Operators
//		Operator	Meaning						Example	Result
		
//		==			Equal to					5 == 5	true
//		!=			Not equal to				5 != 3	true
//		>			Greater than				7 > 2	true [G]
//		<			Less than					4 < 9	true [L]
//		>=			Greater than or equal to	5 >= 5	true
//		<=			Less than or equal to		3 <= 5	true
		
		var a = 10;
		var b = 20;
		
		 	System.out.println("a == b : " + (a == b));  // false
	        System.out.println("a != b : " + (a != b));  // true
	        System.out.println("a > b  : " + (a > b));   // false
	        System.out.println("a < b  : " + (a < b));   // true
	        System.out.println("a >= b : " + (a >= b));  // false
	        System.out.println("a <= b : " + (a <= b));  // true

	        // OUTPUT
//	        		a == b : false
//	        		a != b : true
//	        		a > b  : false
//	        		a < b  : true
//	        		a >= b : false
//	        		a <= b : true
	}

}
