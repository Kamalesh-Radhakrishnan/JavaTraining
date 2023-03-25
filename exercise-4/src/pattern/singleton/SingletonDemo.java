package pattern.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		
		Singleton vanakkam = Singleton.getInstance();
		vanakkam.name = "Kamalesh";
		System.out.println(vanakkam.name);
		Singleton namaste = Singleton.getInstance();
		namaste.name = "Venkatesh";
		System.out.println(namaste.name);
		System.out.println(vanakkam.name);  
		
	}
	
}
