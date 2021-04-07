package in.ashokit.beans;

public class ZetaCardPayment implements ICardPayment {

	public boolean payBill(Double billAmt) {
		System.out.println("Paying bill Amount using zeta card... "+billAmt);
		
		//logic to check balance is available or not
		
		return true;
	}
}
