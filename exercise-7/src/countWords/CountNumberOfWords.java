package countWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Kamalesh
 * 
 * counting number of words.
 *
 */
class CountNumberOfWords {

	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 0;
		//try with reader resource
		try (BufferedReader br = new BufferedReader(new FileReader("inputFolder/input.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                String[] words = s.split("[\\s\\p{Punct}]+");//refer Pattern class for regexes //+? //check oup
                for(String x : words)
                	System.out.println(x);
                count += words.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println("File contains " + count + " words");
	}
	
}
