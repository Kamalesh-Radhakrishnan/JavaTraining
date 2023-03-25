package pattern.factory;

import java.util.Scanner;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter your favourite model in pulsar: ");
			boolean flag = true;
			while(flag) {
				try {
					String model = sc.next();
					BajajFactory bajaj = new BajajFactory();
					Pulsar pulsar = bajaj.getPulsar(model);
					pulsar.createPulsar();
					flag = false;
				}catch(NullPointerException npe) {
					System.out.println("Sorry the model you've entered is invalid. Enter a valid model...");
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		finally {
			sc.close();
		}
	}
}
