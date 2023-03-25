package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;

class DateObjectMemento {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Date date = new Date();
		System.out.println(date.dateTime);
		System.out.println("Object is written to 'date.dat' file");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("date.dat"));
		oos.writeObject(date);
		System.out.println("\nReference will be updated with new Date object and new LocalDateTime");
		date = new Date();
		System.out.println(date.dateTime);
		System.out.println("\nObject is read from 'date.dat' file");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("date.dat"));
		date = (Date) ois.readObject();
		System.out.println("\nDate is restored back from the actual object saved to the dat file");
		System.out.println(date.dateTime);
		
		
	}
	
}


class Date implements Serializable{
	
	LocalDateTime dateTime;
	
	Date(){
		dateTime = LocalDateTime.now();
	}
	
}