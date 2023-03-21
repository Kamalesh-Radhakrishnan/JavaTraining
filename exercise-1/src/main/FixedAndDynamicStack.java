package main;

import java.util.Arrays;

public class FixedAndDynamicStack {
	
	public static void main(String[] args) {
		Stack st = new FixedStack(5);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		int ret;
		for(int i = 0;i < 6;i++) {
			ret = st.pop();
			if(ret != -1) {
				System.out.println(ret);
			}
		}
		st = new DynamicStack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		for(int i = 0;i < 6;i++) {
			ret = st.pop();
			if(ret != -1) {
				System.out.println(ret);
			}
		}
	}

}

interface Stack{
	void push(int data);
	int pop();
}

class FixedStack implements Stack{
	int size;
	int[] stack;
	int top;
	
	public FixedStack(int size) {
		this.size = size;
		stack = new int[size];
		//Arrays.fill(this.stack,Integer.MIN_VALUE);
		top = -1;
	}
	
	public void push(int data) {
		// TODO Auto-generated method stub
		if(top < size - 1) {
			stack[++top] = data;
			System.out.println("Successfully pushed " + data);
		}else {
			System.out.println("Sorry StackOverflow!");
		}
		
	}
	
	public int pop() {
		// TODO Auto-generated method stub
		int ret = -1;
		if(top != -1) {
			ret = stack[top];
			top--;
			//this.stack[this.top--] = Integer.MIN_VALUE;
		}else {
			System.out.println("Sorry StackUnderflow!");
		}
		return ret; //-1 or minValue
	}
}

class DynamicStack implements Stack{
	
	int size = 2;
	int[] stack;
	int top;
	
	public DynamicStack() {
		stack = new int[size];
		//Arrays.fill(stack,Integer.MIN_VALUE);
		top = -1;
	}
	
	
	public void push(int data) {
		// TODO Auto-generated method stub
		
		if(top < size - 1) {
			stack[++top] = data;
			System.out.println("Successfully pushed " + data);
		}else if(top == size - 1) {
			int[] arr = new int[size * 2];
			System.arraycopy(stack, 0, arr, 0, size);
			stack = arr;
			size = arr.length;
			stack[++top] = data;
			System.out.println("Successfully pushed " + data);
		}
		
	}
	
	public int pop() {
		// TODO Auto-generated method stub
		int ret = -1;
		if(top != -1) {
			ret = stack[top--];
			if(top == size/2) {
				int[] arr = new int[(size/2) + 3];
				size = (size/2) + 3;
				System.arraycopy(stack, 0, arr, 0, size);
			}
		}else {
			System.out.println("Sorry StackUnderflow!\nReturned Zero!!!");
		}
		return ret;
	}
	
}

