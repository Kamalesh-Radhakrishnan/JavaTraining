package main;

import java.util.Scanner;

public class PrimePalindromePerfect {

	public boolean isPrime(int n) {
		if(n % 2 == 0 || n == 0 || n== 1)
			return false;
		else {
			int root = (int)Math.sqrt(n);
			for(int i = 3;i < root;i++)
				if(n % i == 0)
					return false;
		}
		return true;
		
	}
	
	boolean isPalindrome(int n) {
		
		int number = n, reverse = 0;  
		while(number != 0){  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;  
		}  
		if(reverse == n) {
			return true;
		}
		return false;
		
	}
	
	
	boolean isArmstrong(int n) {
		int copy = n,remainder = 0,sum = 0,pow = Integer.toString(n).length();
		while(n != 0) {
			remainder = n % 10;
			sum += Math.pow(remainder, pow);
			n = n / 10;
		}
		if(copy == sum)
			return true;
		return false;
	}
	
	boolean isPerfect(int n) {
		if(n == 1)
			return false;
		int sum = 1;
		for(int i = 2;i < n;i++)
			if(n % i == 0)
				sum+=i;
		if(sum==n)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		PrimePalindromePerfect class15 = new PrimePalindromePerfect();
		
		
		for(int i = 1;i < 100;i++)
			if(class15.isPrime(i))
				System.out.print(i + " , ");
		
		
		System.out.println("\n\nEnter a number to check for armstrong, perfect & palindrome\n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if(class15.isArmstrong(n))
			System.out.println("It's an Armstrong number.");
		if(class15.isPerfect(n))
			System.out.println("It's a Perfect number.");
		if(class15.isPalindrome(n))
			System.out.println("It's a Palindrome number.");
		System.out.println("Program completed");
		
	}
	
}
