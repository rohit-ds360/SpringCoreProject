package in.ashokit.beans;

public class ZetaCardPayment implements IPayment {

	public ZetaCardPayment() {
		System.out.println("ZetaCardPayment :: constructor");
	}

	public boolean payBill(Double billAmt) {
		System.out.println("ZetaCard payBill() method got called...");
		return true;
	}

}
