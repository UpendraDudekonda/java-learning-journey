package SelectionStmt;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		// it don't check before and after conditions , it directly evaluate the true condition
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the day : ");
		int day =  sc.nextInt();
		
		switch(day) {
			
		case 1: System.out.println("it is Sunday"); break;
		case 2: System.out.println("it is Monday"); break;
		case 3: System.out.println("it is Guesday"); break;
		case 4: System.out.println("it is Wednesday"); break;
		case 5: System.out.println("it is Thursday"); break;
		case 6: System.out.println("it is Friday"); break;
		case 7: System.out.println("it is Saturday"); break;
		
		default : System.out.println("Enter the valid day");break;
		
		}

	}

}
