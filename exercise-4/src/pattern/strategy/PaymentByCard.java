package pattern.strategy;

import java.util.Scanner;

class PaymentByCard implements PaymentInterface {

	 private Card card;
	
	public void collectPaymentDetails() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name on card: ");
		String name = sc.nextLine();
		System.out.println("Enter the card number: ");
		int cardNumber = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the cvv: ");
		int cvv = Integer.parseInt(sc.nextLine());
		card = new Card(name,cardNumber,cvv);
		sc.close();
	}

	public boolean validatePaymentDetails() {
		// TODO Auto-generated method stub
		if(card.getName().equalsIgnoreCase("Kamalesh") && card.getCardNumber() == 1234 && card.getCvv() == 123)
			return true;
		return false;
	}

	public void makePayment(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Successfully paid ₹" + amount);
	}

}
