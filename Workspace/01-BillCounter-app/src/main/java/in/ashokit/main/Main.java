package in.ashokit.main;

import in.ashokit.beans.CreditCardPayment;
import in.ashokit.beans.PaymentProcessor;
import in.ashokit.beans.ZetaCardPayment;

public class Main {

	public static void main(String[] args) {
		
		//Constructor injection
		PaymentProcessor processor = new PaymentProcessor(new CreditCardPayment());
		
		//injecting dependent class object into target class object
		//setter injection
		processor.setCardPayment(new ZetaCardPayment());
		
		boolean paymentStatus = processor.doPayment(1345.00);
		
		if(paymentStatus)
			System.out.println("Payment processed successfully...!!");
		else
			System.out.println("Failed to process payment...!!");
	}

}
