package in.ashokit.beans;

public class CreditCardPayment implements ICardPayment {

	public boolean payBill(Double billAmt) {
		System.out.println("Paying bill Amount using credit card... "+billAmt);
		
		//logic to check balance is available or not
		
		return true;
	}
	
}
