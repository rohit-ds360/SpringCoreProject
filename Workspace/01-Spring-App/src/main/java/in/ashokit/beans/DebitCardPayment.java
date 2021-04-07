package in.ashokit.beans;

public class DebitCardPayment implements IPayment {

	public DebitCardPayment() {
		System.out.println("DebitCardPayment :: constructor");
	}

	public boolean payBill(Double billAmt) {
		System.out.println("DebitCard payBill() method got called...");
		return true;
	}

}
