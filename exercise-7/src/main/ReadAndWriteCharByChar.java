package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class ReadAndWriteCharByChar {

	public static void main(String[] args) throws IOException {
		
		FileReader in = new FileReader("inputFolder/input.txt");
		FileWriter out = new FileWriter("outputFolder/output.txt");
		
		BufferedReader br = new BufferedReader(in);
		int c = 0;
		while((c = br.read()) != -1) {
			String s = Character.toString((char) c);
			out.write(s);
		}
		br.close();
		in.close();
		out.close();
	}
}
