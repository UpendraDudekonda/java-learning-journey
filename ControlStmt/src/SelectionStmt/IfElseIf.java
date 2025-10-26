package SelectionStmt;
import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		// if-else-if checks the condition until true. means before true every condition will check.

		// give the number for the corresponding week
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day number: ");
		
		int day = sc.nextInt();
		
		if(day == 1) {
			System.out.println("it is sunday");
		} else if (day == 2 ){
			System.out.println("it is monday");
		} else if(day == 3 ) {
			System.out.println("it is tuesday");
		} else if (day == 4) {
			System.out.println("it is wednesday");
		} else if (day == 5 ) {
			System.out.println("it is thursday");
		}else if (day == 6) {
			System.out.println("it is Friday");
		} else if (day ==7){
			System.out.println("it is saturday");
		} else {
			System.out.println("enter the valid day");
		}
		
	}

}
