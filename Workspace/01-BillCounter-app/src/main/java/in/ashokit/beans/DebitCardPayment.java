package in.ashokit.beans;

public class DebitCardPayment implements ICardPayment {

	public boolean payBill(Double billAmt) {
		System.out.println("Paying bill Amount using debit card... "+billAmt);
		
		//logic to check balance is available or not
		
		return true;
	}
}
