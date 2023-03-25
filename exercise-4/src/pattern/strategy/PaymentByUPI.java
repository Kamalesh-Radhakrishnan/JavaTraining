package pattern.strategy;

import java.util.Scanner;

class PaymentByUPI implements PaymentInterface {

	Upi upi;
	
	public void collectPaymentDetails() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UPI Id: ");
		String upiId = sc.nextLine();
		System.out.println("Enter passcode: ");
		int passcode = Integer.parseInt(sc.nextLine());
		upi = new Upi(upiId,passcode);
		sc.close();

	}

	public boolean validatePaymentDetails() {
		// TODO Auto-generated method stub
		if(upi.getUpiId().equalsIgnoreCase("kamalesh@okbob") && upi.getPasscode() == 1234)
				return true;
		return false;
	}

	public void makePayment(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Successfully paid ₹" + amount);
	}

}
