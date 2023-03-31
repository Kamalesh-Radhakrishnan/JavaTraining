package readLine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Kamalesh
 *
 *         reading a file line-by-line
 *
 */
class ReadFileLineByLine {

	/**
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try (BufferedReader reader = new BufferedReader(new FileReader("inputFolder/input.txt"));){
			// Read lines one by one
			int lineCount = 0;
			while (true) {
				int line = reader.read();
				if (line == -1) {
					break;
				} else if (line == '\n') {
					lineCount++;
					System.out.println();
				} else {
					System.out.print((char) line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
