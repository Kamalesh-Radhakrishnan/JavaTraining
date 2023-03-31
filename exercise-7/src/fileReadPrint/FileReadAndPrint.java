package fileReadPrint;

import java.io.FileNotFoundException;
import java.io.FileReader;
/**
 * 
 * @author Kamalesh
 *
 * reading and printing a file.
 *
 */
class FileReadAndPrint {

	
	/**
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {

		
		try(FileReader in = new FileReader("inputFolder/input.txt");) {
			char[] c = new char[8];
			int i = 0;
			while((i = in.read(c)) != -1) {//i stores the values count read into char array...
				String s = new String(c,0,i);//read in c starting from 0th position upto i...
				System.out.print(s);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
