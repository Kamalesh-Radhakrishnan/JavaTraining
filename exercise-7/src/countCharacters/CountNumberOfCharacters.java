package countCharacters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Kamalesh
 * 
 * counting number of characters.
 *
 */
class CountNumberOfCharacters {
	
	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {  //close objs

		//Initializing the inputStream object
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
        	
        	int totalCount = 0;
            String s;
            
            while ((s = br.readLine())!= null) {
            	System.out.println(s);
                totalCount+=s.length();
                System.out.println("Number of characters entered: " + s.length() + " Total count: " + totalCount);
            }
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }
		
	}

}
