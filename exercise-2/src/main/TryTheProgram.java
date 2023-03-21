package main;

public class TryTheProgram {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.mth1();
	}
}

class Sample{
	public void mth1() {
		mth2();
		System.out.println("After calling method 2");
	}
	public void mth2() {
		try{
			int a = 1/0;
			return;	
		}
		catch(Exception e) {
			System.out.println("Exception caught in method 2 : "+e);
		}
		finally {
			System.out.println("Finally in method 2"); //no effect on return
		}
	}
}