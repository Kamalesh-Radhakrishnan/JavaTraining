package pattern.strategy;

class PaymentGateway {

	int totalAmount;
	boolean deliveryCharge;
	
	PaymentInterface payment;
	
//	PaymentGateway(int totalAmount,boolean deilveryCharge){
//		this.totalAmount = totalAmount;
//		this.deliveryCharge = deliveryCharge;
//	}
	
	public void processOrder() {
		payment.collectPaymentDetails();
		if(payment.validatePaymentDetails()) {
			payment.makePayment(getTotalAmount());
		}else {
			System.out.println("Payment declined due to invalid credentials");
		}
	}

	private int getTotalAmount() {
		// TODO Auto-generated method stub
		return deliveryCharge ? totalAmount + 50 : totalAmount;
	}
	
}
