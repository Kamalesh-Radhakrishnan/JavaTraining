package pattern.flyweight;

class Energon {

	private static Energon instance;
	
	private Energon() {}
	
	synchronized public static Energon getInstance() {
		if(instance == null)
			instance = new Energon();
		return instance;
	}
	
}
