package main;

public class StartThreadTwice implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StartThreadTwice obj = new StartThreadTwice();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("Thread started once.");
		thread.start();
		System.out.println("Thread started again.");
		
	}

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
