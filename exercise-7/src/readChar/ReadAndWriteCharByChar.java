package readChar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 
 * @author Kamalesh
 *
 * reading a file char by char.
 *
 */
class ReadAndWriteCharByChar {

	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		//Initializing objects for file reader & writer		
		try(FileReader in = new FileReader("inputFolder/input.txt");
				FileWriter out = new FileWriter("outputFolder/output.txt");){
			
			//buffered reader with file reader reference
			BufferedReader br = new BufferedReader(in);
			
			int c = 0;
			while((c = br.read()) != -1) {
				String s = Character.toString((char) c);
				out.write(s);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
