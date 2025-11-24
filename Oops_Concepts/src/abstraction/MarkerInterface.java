package abstraction;

// if the interface doesnot have any methods then it is calls, tagged or marker interface
interface Information {
	
}

class GetInfo implements Information {
	
}

public class MarkerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetInfo getInfo = new GetInfo();

	}

}
