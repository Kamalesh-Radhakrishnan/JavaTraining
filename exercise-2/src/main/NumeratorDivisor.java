package main;

import java.util.Scanner;

public class NumeratorDivisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numerator = 0,divisor = 0;
		boolean flag = false;
		while(true) {
			while(!flag) {
				try {
					System.out.println("Enter a numerator: ");
					numerator = Integer.parseInt(sc.next());
					flag = true;
				}catch(NumberFormatException e) {
					System.out.println("Enter a valid number: ");
				}
			}
			while(flag) {
				try {
					System.out.println("Enter a denominator: ");
					divisor = Integer.parseInt(sc.next());
					flag = false;
				}catch(NumberFormatException e) {
					System.out.println("Enter a valid number: ");
				}
			}
			try {
				int division = numerator/divisor;
				System.out.println("Divison is: " + division);
			}catch(ArithmeticException ae) {
				flag = true;
				System.out.println("Can't divide by zero.");
			}
			
		}
	}
	
}


//change