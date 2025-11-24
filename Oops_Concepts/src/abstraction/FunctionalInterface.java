package abstraction;

interface ThereadInfo {
	void getThread();
}

class RunThread  implements ThereadInfo {

	@Override
	public void getThread() {
		// TODO Auto-generated method stub
		System.out.println("the thread for that calss is already running..");
	}
	
}
public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunThread runThread = new RunThread();
		runThread.getThread();
	}

}
//output
//the thread for that calss is already running..
