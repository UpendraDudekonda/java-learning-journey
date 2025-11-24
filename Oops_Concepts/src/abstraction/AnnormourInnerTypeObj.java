package abstraction;

// generally, we canot create for obj for abstract(unless extends) and interface(unless implements)
// this can be solved by this annormous inner type object, but immediate use onlt

abstract class Wish {
	
	abstract void doWish();
}


interface Invite{
	void doInvite();
}

public class AnnormourInnerTypeObj {

	public static void main(String[] args) {
		
		Wish w = new Wish() {
			void doWish() {
				System.out.println("hi learner...!!");
			}
		};
		
		w.doWish();
		
		
		System.out.println("*************************");
		
		Invite invite =new  Invite() {
			
			public void doInvite() {
				System.out.println("hi, you are welcome..");
			}
			
		};
		
		invite.doInvite();
	}

}
//output
//hi learner...!!
//*************************
//hi, you are welcome..
