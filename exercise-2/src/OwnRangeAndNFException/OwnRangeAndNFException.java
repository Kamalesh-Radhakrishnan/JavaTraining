package OwnRangeAndNFException;

/*
 * @author Kamalesh A R
 * **/

import java.util.Scanner;

public class OwnRangeAndNFException {
	
	static String nfemsg = "NumberFormatException: Yen uyira vaangadha da. Number ah matum podu da...";
	
	public static void checkRange(int n) throws MyRangeException {
		if(n < 0 || n > 100) {
			throw new MyRangeException();
		}
	}

	
	public static int checkNumber(String s) throws MyNumberFormatException{
		int i;
		try {
			i = Integer.parseInt(s);
		}catch(NumberFormatException nfe) {
			throw new MyNumberFormatException("OwnRangeAndNFException: Yen uyira vaangadha da. Number ah matum podu da...");
		}
		return i;
	}
	
	public static void main(String[] args) throws MyRangeException {
		Scanner sc = new Scanner(System.in);
		int num = 10;
		int numsCopy = num;
		int sum = 0,a,avg;
		for(int i = 0;i < 10;i++) {
			System.out.println("Student " + (numsCopy - (--num)));
			boolean flag = true;
			while(flag) {
				try {
					String s = sc.next();
					a = checkNumber(s);
					checkRange(a);
					sum+=a;
					flag = false;
				}catch(MyNumberFormatException nfe) {
					System.out.println(nfe.getMessage());
					
				}catch(MyRangeException myrange) {
					
				}
			}
		}
		avg = sum/10;
		System.out.println("Average is : "+ avg);
		sc.close();
	}
}

