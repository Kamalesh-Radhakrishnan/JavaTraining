package main;

import java.util.Scanner;

public class PrintOddEven {
		
	static int counter;
	static int end;
	
	public synchronized void printOdd() {
		while(counter < end) {
			while(counter % 2 == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.print(counter++ + " ");
			notify();
		}
	}
	
	public synchronized void printEven() {
		while(counter < end) {
			while(counter % 2 == 1) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.print(counter++ + " ");
			notify();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		counter = sc.nextInt();
		end = sc.nextInt();
	    PrintOddEven obj = new PrintOddEven();
		
		new Thread(new Runnable() {
			public void run() {
				obj.printOdd();
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				obj.printEven();
			}
		}).start();
	}

}
