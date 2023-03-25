package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyAnImageByteByByte {

	public static void main(String[] args) {
		
		try {
            FileInputStream in = new FileInputStream("inputFolder/input.jpeg");
            FileOutputStream out = new FileOutputStream("outputFolder/output.jpeg");
            byte[] data = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(data)) != -1) {
                out.write(data, 0, bytesRead);
            }
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
}
