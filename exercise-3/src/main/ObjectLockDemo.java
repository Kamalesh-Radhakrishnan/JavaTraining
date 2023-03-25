package main;

public class ObjectLockDemo extends Thread{
	
	StringBuffer sb;
	
	public ObjectLockDemo(StringBuffer sb) {
		this.sb = sb;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(sb) {
			System.out.println(Thread.currentThread().getName());
			for(int i = 1;i <= 100;i++)
				System.out.print(sb);
			System.out.println();
			sb.setCharAt(0, (char)(sb.charAt(0) + 1));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer buffer = new StringBuffer("A");
		ObjectLockDemo t1 = new ObjectLockDemo(buffer);
		ObjectLockDemo t2 = new ObjectLockDemo(buffer);
		ObjectLockDemo t3 = new ObjectLockDemo(buffer);
		
		t1.start();
		t2.start();
		t3.start();
	}

}