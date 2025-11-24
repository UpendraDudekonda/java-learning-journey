package encapsulation;

class PersonInfo {
	
	private int accNumber ;
	private String name;
	private String keynumber;
	
	//giving values to secure data by using constructor [constructor setting]
	public PersonInfo(int accNumber, String name, String keynumber) {
		this.accNumber = accNumber;
		this.name = name;
		this.keynumber = keynumber;
	}
	
	//default constructor we must provide , if we have any parameter constructor
	public PersonInfo() {
		
	}

	//giving values to secure data by using setters
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setKeynumber(String keynumber) {
		this.keynumber = keynumber;
	}
	
	
	//accessing the secure data by using the getters
	public int getAccNumber() {
		return accNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAccnumber() {
		return keynumber;
	}
	
}

public class BankDetails {

	public static void main(String[] args) {
		
		PersonInfo info = new PersonInfo(12345, "upendra", "sbi1234");
		
		System.out.println("The customer name : " + info.getName());
		System.out.println("The customer account number : " + info.getAccnumber());
		System.out.println("The customer key number : " + info.getAccNumber());
		//OUTPUT
//		The customer name : upendra
//		The customer account number : sbi1234
//		The customer key number : 12345
		
		System.out.println();
		
		PersonInfo info2 = new PersonInfo();
		
		info2.setName("Dudekonda Upendra");
		info2.setAccNumber(98765);
		info2.setKeynumber("union1221");
		
		System.out.println("The customer name : " + info2.getName());
		System.out.println("The customer account number : " + info2.getAccnumber());
		System.out.println("The customer key number : " + info2.getAccNumber());
		
//		OUTPUT
//		The customer name : Dudekonda Upendra
//		The customer account number : union1221
//		The customer key number : 98765

	}

}
