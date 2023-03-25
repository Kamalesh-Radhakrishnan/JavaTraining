package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintStringForTenNumbers {
	
	static int count = 1;

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(() -> {
			for(int j = 0;j < 100;j++)
				try {
					printNumber();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		});
	}
	
	synchronized static void printNumber() throws InterruptedException {
		System.out.println(count);
		if(count%10 == 0) {
			System.out.println("Yay! You've successfully reached count " + count + ".");
		}
		count++;
		Thread.sleep(1000);
	}
	
}
