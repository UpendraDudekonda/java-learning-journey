package polymorphism;
class Payment {
	
	void makePayment() {
		System.out.println("Make a generic payment....");
		
	}
	
	void paysafe() {
		System.out.println("online payment is safe and secure...");
	}
}

class CreditPayment extends Payment {
	
	void makePayment() {
		System.out.println("Make a  payment via credit card....");
	}
}

class UpiPayment extends Payment {
	
	void makePayment() {
		System.out.println("Make a  payment via UPI ....");
	}
	
	void getOffers() {
		System.out.println("make payment through upi we get offers....");
	}
	
}

class Netbanking extends Payment {
	
	void makePayment() {
		System.out.println("Make a  payment via Netbanking ....");
	}
}

public class MethodOverRiding_upcasting {

	public static void main(String[] args) {
		
		Payment pay ; // creating the child class obj with parent reference
		
		pay =  new CreditPayment();
		pay.makePayment();
		
		pay = new Netbanking();
		pay.makePayment();
		
		pay = new UpiPayment();
		pay.makePayment();
		
		
		//	pay.getOffers(); The method getOffers() is undefined for the type Payment
		// we cannot get the child specific methods during the upcasting.	
		
		pay.paysafe(); // we can get the parent specific methods also in upcasting
		
		if (pay instanceof UpiPayment) {
			
			UpiPayment upay = (UpiPayment) pay ;
			upay.getOffers();
		} else {
			System.out.println("pay is not upiPayment instance, downcast not possible.");
		}
		
		
	}

}
