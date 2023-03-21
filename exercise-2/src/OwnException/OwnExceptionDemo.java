package OwnException;

public class OwnExceptionDemo {
	public static void main(String[] args) {
		try {
			throw new MyException();
			//throw new MyException("Practicing Exception!");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
