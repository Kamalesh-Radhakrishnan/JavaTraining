package pattern.bridge;

public class BridgeDemo {

	public static void main(String[] args) {
		VolkswagenEngine engine = new VolkswagenEngine();
		VolkswagenGearBox gearBox = new VolkswagenGearBox();
		
		Chiron chiron = new Chiron();
		chiron.buildChiron(engine, gearBox);
		System.out.println(chiron);		
		
	}
}
