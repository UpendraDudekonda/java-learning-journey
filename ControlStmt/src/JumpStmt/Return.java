package JumpStmt;

public class Return {

	public static void main(String[] args) {
		
		// return is used to return the values 
		
		// ex: we used for methods
		
		boolean isEven = isEven(11);
		
		if(isEven) {
			System.out.println("the number is even.");
		} else {
			System.out.println("the number is odd.");
		}

	}

	public static boolean isEven(int n) {
		
		if(n%2==0) {
			return true;
			
		}
		
		return false;
	}
}
