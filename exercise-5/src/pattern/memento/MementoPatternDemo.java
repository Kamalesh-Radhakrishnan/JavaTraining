package pattern.memento;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class MementoPatternDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Human kamalesh = new Human("Kamalesh",21);
		System.out.println(kamalesh.name + " : " + kamalesh.age);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("kamalesh.dat"));
		oos.writeObject(kamalesh);
		
		kamalesh.age = 20;
		System.out.println(kamalesh.name + " : " + kamalesh.age);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("kamalesh.dat"));
		kamalesh = (Human) ois.readObject();
		System.out.println(kamalesh.name + " ==> " + kamalesh.age);
	}
	
}
