package pattern.strategy;

interface PaymentInterface {

	void collectPaymentDetails();
	boolean validatePaymentDetails();
	void makePayment(int amount);
	
}
