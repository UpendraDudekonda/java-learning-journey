package SelectionStmt;

import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args) {
	
		// simple if check all the if conditions even though the true had found already
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the digit : ");
		
		int digit =  sc.nextInt();
		
		if(digit == 1) {
			System.out.println("the digit " + digit + " is : one" );
		}
		
		if(digit == 2) {
			System.out.println("the digit " + digit + " is : two" );
		}
		
		if(digit == 3) {
			System.out.println("the digit " + digit + " is : three" );
		}
		
		if(digit == 4) {
			System.out.println("the digit " + digit + " is : four" );
		}
		
		if(digit == 5) {
			System.out.println("the digit " + digit + " is : five" );
		}

	}

}
