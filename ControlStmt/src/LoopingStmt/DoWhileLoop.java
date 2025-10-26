package LoopingStmt;

public class DoWhileLoop {

	public static void main(String[] args) {
	
		// the first one execute irrespective of condition 
		// do { stmts and updation } while(condition) 
		
	   // do { stmts and updation } while(true)  ->  infinite loop
		int i = 0;
		
		do {
			System.out.println(i); 
			
			i++;		// increment or decrement
		} while(i<=5) ; // condition
		
		
	}

}
