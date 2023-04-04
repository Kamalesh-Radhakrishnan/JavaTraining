package pattern.builder;

class TataSafari {
	
	Engine engine;GearBox gearBox;Wheels wheels;
	
	private TataSafari(Engine engine,GearBox gearBox,Wheels wheels) {
		this.engine = engine;
		this.gearBox = gearBox;
		this.wheels = wheels;
	}
	
	static class TataSafariBuilder{
		
		Engine engine;GearBox gearBox;Wheels wheels;
		
		public TataSafariBuilder setEngine(Engine engine) {
			this.engine = engine;
			return this;
		}
		
		public TataSafariBuilder setGearBox(GearBox gearBox) {
			this.gearBox = gearBox;
			return this;
		}
		
		public TataSafariBuilder setWheels(Wheels wheels) {
			this.wheels = wheels;
			return this;
		}
		
		public TataSafari build() {
			return new TataSafari(engine,gearBox,wheels);
		}
		
	}

	public String toString() {
		return "TataSafari [engine=" + engine + ", gearBox=" + gearBox + ", wheels=" + wheels + "]";
	}
	
}
