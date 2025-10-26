package SelectionStmt;
import java.util.Scanner;


public class IfElse {

	public static void main(String[] args) {
		
		// if condition execute if condition is true or else statement will execute
		// Check the eligibility for vote
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter you are Age: ");
		int age =  sc.nextInt();
		
		System.out.println("Well come to voting app");
		System.out.println("***********");
		if(age >= 18 && age <=110) {
			System.out.println("you are eligible for voting");
		} else {
			System.out.println("you are not eligible for voting");
		}
		

	}

}
