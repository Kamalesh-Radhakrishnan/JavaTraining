package main;

public class ExtendsExercise {
	public static void main(String[] args) {
		C c = new C();
	}
}

class A{
	static {
		System.out.println("Hello from A static");
	}
	 B obj=new B();
	public A() {
		System.out.println("Constructor of A called.");
	}
	static B obj1=new B();
}

// static block
//static properties
// properties
//super class const
//sub class constructor



class C extends A{
	
	
	static int flag;
	
	static void printl() {
		System.out.println("static method from C");
	}
	
	static {
		System.out.println("Hello from C static");
	}
	
	public C() {
		System.out.println("Constructor of C called");
		printl();
	}
	
}
class B{
	public B() {
		System.out.println("Constructor of B called.");
	}
}

//class D{
//	public D() {
//		System.out.println("Constructor of D called.");
//	}
//}
