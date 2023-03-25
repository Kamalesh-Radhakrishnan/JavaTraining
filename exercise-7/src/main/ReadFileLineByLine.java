package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

class ReadFileLineByLine {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("inputFolder/input.txt");
		BufferedReader in = new BufferedReader(fr);
		
		try {
			String s;
			while((s = in.readLine()) != null) {
				System.out.println(s);
			}
			fr.close();
			in.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
