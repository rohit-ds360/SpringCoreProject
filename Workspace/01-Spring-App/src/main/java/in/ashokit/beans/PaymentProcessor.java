package in.ashokit.beans;

public class PaymentProcessor {
	
	public PaymentProcessor(IPayment payment) {
		System.out.println("PaymentPeocessor constructor called...");
		this.payment = payment;
	}

	private IPayment payment;

	/*
	 * public void setPayment(IPayment payment) { this.payment = payment; }
	 */
	public void doPayment(Double billAmt) {
		boolean isPaymentDone = payment.payBill(billAmt);
		
		if(isPaymentDone)
			System.out.println("Payment completed successfully...!! "+billAmt);
		else
			System.out.println("Payment failed...!!");
	}
	
}
