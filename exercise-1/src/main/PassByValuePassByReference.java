package main;

import java.util.Arrays;

public class PassByValuePassByReference {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		Primitive primitive = new Primitive();
		ChangeValue cv = new ChangeValue();
		System.out.println("Primitive before passing: " + primitive.data);
		cv.changeValue(primitive.data);
		System.out.println("After passing primitive datatype: " + primitive.data);
		cv.changeValue(primitive);
		System.out.println("After passing reference : " + primitive.data);
		
		System.out.println("Array before passing " + Arrays.toString(arr));
		cv.changeValue(arr);
		System.out.println("Array after passing " + Arrays.toString(arr));
	}
	
}


class Primitive{
	int data = 10;
}

class ChangeValue{
	public void changeValue(int data) {
		data*=100;
	}
	
	public void changeValue(int[] arr) {
		arr[0] = 100;
	}
	
	public void changeValue(Primitive primitive) {
		primitive.data*=100;
	}
	
}