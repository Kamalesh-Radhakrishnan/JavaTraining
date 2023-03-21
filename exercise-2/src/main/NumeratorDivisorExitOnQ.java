package main;

import java.util.Scanner;

public class NumeratorDivisorExitOnQ {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int numerator = 0,divisor = 0;
		String s = "";
		boolean flag = false;
		while(true) {
			while(!flag) {
				try {
					System.out.println("Enter a numerator: ");
					s = sc.next();
					numerator = Integer.parseInt(s);
					flag = true;
				}catch(NumberFormatException e) {
					if(Character.toString(s.charAt(0)).toLowerCase().equals("q")) {
						System.out.println("System will exit on status 0");
						System.exit(0);
					}
					System.out.println("Enter a valid number: ");
				}
			}
			while(flag) {
				try {
					System.out.println("Enter a denominator: ");
					s = sc.next();
					divisor = Integer.parseInt(s);
					flag = false;
				}catch(NumberFormatException e) {
					if(Character.toString(s.charAt(0)).toLowerCase().equals("q")) {
						System.out.println("System will exit on status 0");
						System.exit(0);
					}
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
