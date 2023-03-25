package pattern.strategy;

import java.util.Scanner;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		PaymentGateway gateway = new PaymentGateway();
		
		System.out.println("Enter the total Amount");
		gateway.totalAmount = Integer.parseInt(sc.nextLine());
		
		System.out.println("Do you want delivery?");
		String choice = sc.nextLine();
		
		gateway.deliveryCharge = choice.equalsIgnoreCase("Yes") ? true : false;
		
		System.out.println("Enter Payment Method (Card/Upi): ");
		
		String paymentOption = sc.nextLine();
		if(paymentOption.equalsIgnoreCase("Card"))
			gateway.payment = new PaymentByCard();
		else if(paymentOption.equalsIgnoreCase("UPI"))
			gateway.payment = new PaymentByUPI();
		
		gateway.processOrder();
		
		sc.close();
	}

}
