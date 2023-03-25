package main;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class CountNumberOfCharacters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalCount = 0;
        String s;
        while ((s = br.readLine())!= null) {
        	System.out.println(s);
            totalCount+=s.length();
            System.out.println("Number of characters entered: " + s.length() + " Total count: " + totalCount);
        }
		
	}

}
