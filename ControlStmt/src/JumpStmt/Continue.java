package JumpStmt;

public class Continue {

	public static void main(String[] args) {


		for (int i = 1; i<= 10 ;i++) {
			
			if( i %2==0) {
				continue;   // it skip type specific and goes to next step
			}
			System.out.println(i);
			
		}

	}

}
