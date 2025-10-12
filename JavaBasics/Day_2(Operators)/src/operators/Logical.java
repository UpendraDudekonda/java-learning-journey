package operators;

public class Logical {

	public static void main(String[] args) {
		
		// there are 3 major logical operators in java 1) AND && 2) OR || 3) NOT !
		// used in while , if , etc...

		// && and gives true only when both are true else it give false [00 -> 0 , 01->0, 10 -> 0, 11->1 ]
		// || or gives true when either one is true gives false only both are false [00->0, 01->1, 10->1, 11->1]
		// ! just as opposite of it, ex !true = false , !false = true
		
		int a = 2;
        int b = 1;
        int c = 3;

        // AND Operator
        System.out.println((a > b) && (a < c));  // true && true = true
        System.out.println((a > b) && (a > c));  // true && false = false

        // OR Operator
        System.out.println((a > b) || (a > c));  // true || false = true
        System.out.println((a < b) || (a > c));  // false || false = false

        // NOT Operator
        System.out.println(!(a > b));            // !(true) = false
        System.out.println(!(a < b));            // !(false) = true
		}

}
