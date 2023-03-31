package dateObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Kamalesh
 * 
 * creating memento of class {@link dateObject.Date}
 *
 */
class DateObjectMemento {

	/**
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("date.dat"));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("date.dat"));){
			
			//new date object
			Date date = new Date();
			System.out.println(date.dateTime);
			
			System.out.println("Object is written to 'date.dat' file");
			oos.writeObject(date);
			
			System.out.println("\nReference will be updated with new Date object and new LocalDateTime");
			date = new Date();
			System.out.println(date.dateTime);
			
			System.out.println("\nObject is read from 'date.dat' file");
			
			
			date = (Date) ois.readObject();
			System.out.println("\nDate is restored back from the actual object saved to the dat file");
			System.out.println(date.dateTime);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}


