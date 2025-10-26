package LoopingStmt;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		// while loop can be used when, we don't know number of repetition.
		// while(condition) { statements and increment or decrement } 
		// while(true){} -> infinite loop
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		while( n>=0 ) { 			// condition
			System.out.println(n);
			n--;					//increment / decrement
		}
		

	}

}
