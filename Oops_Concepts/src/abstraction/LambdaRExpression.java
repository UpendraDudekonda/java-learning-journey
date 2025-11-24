package abstraction;

// alternative for annormous inner type obj creation when interface is a functional interface. ()->


interface Invite1{
	void doInvite();
}

public class LambdaRExpression {

	public static void main(String[] args) {
	
		
		Invite1  invite = () -> {
			System.out.println("You are welcome....");
		};
		
		invite.doInvite();
		
	}

}
//output
//You are welcome....