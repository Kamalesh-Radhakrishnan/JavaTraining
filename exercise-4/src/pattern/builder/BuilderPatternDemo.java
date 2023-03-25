package pattern.builder;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TataSafari safari = new TataSafari.TataSafariBuilder()
				.setEngine(new Engine.EngineBuilder().setCrankshaft(new CrankShaft()).setPistons(new Pistons()).build())
				.setGearBox(new GearBox.GearBoxBuilder().setGear(new Gear()).setClutch(new Clutch()).build())
				.setWheels(new Wheels()).build();
		
		System.out.println(safari);
		
	}

}
