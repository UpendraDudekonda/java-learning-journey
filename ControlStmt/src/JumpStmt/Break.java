package JumpStmt;

public class Break {

	public static void main(String[] args) {


		// break: can break the entire flow and get out of the block, where it was used.
		
		// ex: switch-case we  used that
		
		for( int i =0 ; i<=10 ; i++ ) {
			
			System.out.println(i);
			if(i == 7) {
				break;
			}
			
		}

	}

}
