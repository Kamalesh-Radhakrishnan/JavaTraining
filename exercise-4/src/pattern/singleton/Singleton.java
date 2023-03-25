package pattern.singleton;

public class Singleton {

	private static Singleton instance;
	protected String name;
	
	private Singleton() {}

	synchronized public static Singleton getInstance() {
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
}
