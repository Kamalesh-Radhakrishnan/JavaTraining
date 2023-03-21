package main;

public class TryTheProgramWithExitStatus {
	public static void main(String[] args) {
		Sample1 s = new Sample1();
		s.mth1();
	}
}

class Sample1{
	public void mth1() {
		mth2();
		System.out.println("Caller function");
	}
	public void mth2() {
		try{
			System.out.println("Before calling system.exit in try");
			System.exit(0);
			System.out.println("After calling system.exit in try");
		}
		catch(Exception e) {
			System.out.println("Exception caught in method 2 : "+e);
		}
		finally {
			System.out.println("Finally in method 2"); //finally vs exit
		}
	}
}
