package main;

import java.io.IOException;

public class IOExceptionDemo {
	public static void main(String[] args) {
		//exceptionPodu(); //compilation error
	}
	
	static void exceptionPodu() throws IOException{
		throw new IOException();
	}
}
