package pattern.memento;

import java.io.Serializable;

class Human implements Serializable{
	String name;
	int age;
	
	Human(String name,int age){
		this.name = name;
		this.age = age;
	}
}
