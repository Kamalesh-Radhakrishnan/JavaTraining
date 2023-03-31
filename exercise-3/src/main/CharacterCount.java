package main;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(1);
		Scanner sc = new Scanner(System.in);
		CharCounter count = new CharCounter();
		es.execute(() -> {
			while(true) {
				char c = sc.next().charAt(0);
				try {
					count.countMethod(c);
				}catch(Exception e) {
					System.out.println("Enter an alphabet.");
				}
			}
		});
		
		es.shutdown();
	}

}


class CharCounter{
	private int counter;
	
	synchronized public void countMethod(char c) throws Exception{
		if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
			counter++;
			System.out.println(counter);
		}else {
			throw new Exception();
		}
	}
	
}