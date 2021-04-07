package in.ashokit.beans;

public class CreditCardPayment implements IPayment {

	public CreditCardPayment() {
		System.out.println("CreditCardPayment :: constructor");
	}

	public boolean payBill(Double billAmt) {
		System.out.println("CreditCard payBill() method got called...");
		return true;
	}

}
