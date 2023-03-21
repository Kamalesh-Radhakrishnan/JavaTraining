package main;



public class SingleTonDemo {
	
	public static void main(String[] args) {
		
//		Singleton single = Singleton.getInstance();
//		System.out.println(single.color);
//		single.color = "red";
//		System.out.println(single.color);
//		Singleton sec = Singleton.getInstance();
//		System.out.println(sec.color);
		
		new Thread(new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				SingleTon obj = SingleTon.getInstance();
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				SingleTon obj2 = SingleTon.getInstance();
			}
		}).start();
		
	}
	
}

//class Singleton{
//	private static Singleton instance;
//	protected String color;
//	private Singleton() {
//		// Singleton code goes here...
//		color = "orange";
//	}
//	
//	public static Singleton getInstance() {
//		if(instance == null) {
//			instance = new Singleton();//
//		}
//		return instance;
//	}
//}

class SingleTon{
	private static SingleTon instance;
	
	private SingleTon(){}
	
	synchronized public static SingleTon getInstance(){
		if(instance == null)
			instance = new SingleTon();
		return instance;
	}
}