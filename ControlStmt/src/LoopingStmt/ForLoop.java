package LoopingStmt;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		// we use for loop , when number of repetition are known.
		// syntax : for ( initialization ; condition ; increment/ decrement) { statements }
		// for(;;) infinite loop
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		
		int n = sc.nextInt();
		int sum = 0;
		
		for ( int i = 0; i <= n ; i++) {
			
			sum = sum+i;
			
		}
		
		System.out.println("the of first " + n + "numbners is : " + sum);
		
	}

}
