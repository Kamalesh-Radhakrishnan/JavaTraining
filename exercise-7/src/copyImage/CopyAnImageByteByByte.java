package copyImage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 
 * @author Kamalesh
 * 
 * copying an image byte-by-byte.
 *
 */
class CopyAnImageByteByByte {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Initializing the input and output streams.
		try(FileInputStream in = new FileInputStream("inputFolder/input.jpeg");
            FileOutputStream out = new FileOutputStream("outputFolder/output.jpeg");) {
			
            //Initializing a byte array whih reads and stores the bytes to write..
            byte[] data = new byte[100];
            int bytesRead;
            while ((bytesRead = in.read(data)) != -1) {
                out.write(data, 0, bytesRead);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
}
