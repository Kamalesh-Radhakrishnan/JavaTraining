package OwnRangeAndNFException;

class MyRangeException extends Exception{
	public MyRangeException() {
		System.out.println("Please enter the numbers in range[0,100]");
	}
}