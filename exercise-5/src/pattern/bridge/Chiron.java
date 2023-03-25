package pattern.bridge;

class Chiron implements Bugatti {

	VolkswagenEngine engine;
	VolkswagenGearBox gearBox;
	
	@Override
	public void fixEngine(VolkswagenParts engine) {
		// TODO Auto-generated method stub
		this.engine = (VolkswagenEngine) engine;
		engine.build();
	}

	@Override
	public void fixGearBox(VolkswagenParts gearBox) {
		// TODO Auto-generated method stub
		this.gearBox = (VolkswagenGearBox) gearBox;
		gearBox.build();
	}
	
	public void buildChiron(VolkswagenParts engine,VolkswagenParts gearBox) {
		this.fixEngine(engine);
		this.fixGearBox(gearBox);
	}

	@Override
	public String toString() {
		return "Chiron [engine=" + engine + ", gearBox=" + gearBox + "]";
	}

	

}
