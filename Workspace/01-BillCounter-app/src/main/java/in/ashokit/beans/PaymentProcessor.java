package in.ashokit.beans;

public class PaymentProcessor {

	//Field Injection
	private ICardPayment cardPayment=null;

	//Constructor injection
	public PaymentProcessor(ICardPayment cardPayment) {
		this.cardPayment = cardPayment;
	}

	//Setter injection
	public void setCardPayment(ICardPayment cardPayment) {
		this.cardPayment = cardPayment;
	}

	public boolean doPayment(Double billAmt) {
		return cardPayment.payBill(billAmt);
	}
}
