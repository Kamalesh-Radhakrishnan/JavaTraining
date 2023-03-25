package main;

import java.io.FileNotFoundException;
import java.io.FileReader;

class FileReadAndPrint {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FileReader in = new FileReader("inputFolder/input.txt");
		try {
			char[] c = new char[8];
			int i = 0;
			while((i = in.read(c)) != -1) {
				String s = new String(c,0,i);
				System.out.print(s);
			}
			in.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
