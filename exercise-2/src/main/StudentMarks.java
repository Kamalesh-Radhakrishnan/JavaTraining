package main;

import java.util.Scanner;

public class StudentMarks {
	
	static String nfemsg = "MyNumberFormatException:Number ah matum podum";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 10;
		int numsCopy = num;
		int sum = 0,a,avg;
		for(int i = 0;i < 10;i++) {
			System.out.println("Student " + (numsCopy - (--num)));
			boolean flag = true;
			while(flag) {
				try {
					a = Integer.parseInt(sc.next());
					sum+=a;
					flag = false;
				}catch(NumberFormatException nfe) {
					System.out.println(nfemsg);
				}
			}
		}
		avg = sum/10;
		System.out.println("Average is : "+ avg);
		sc.close();
	}
	
}
