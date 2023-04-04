package pattern.builder;

class GearBox {
	
	Gear gear;Clutch clutch;
	
	private GearBox(Gear gear,Clutch clutch) {
		this.gear = gear;
		this.clutch = clutch;
	}
	
	static class GearBoxBuilder{
		
		Gear gear;Clutch clutch;
		
		public GearBoxBuilder setGear(Gear gear) {
			this.gear = gear;
			return this;
		}
		
		public GearBoxBuilder setClutch(Clutch clutch) {
			this.clutch = clutch;
			return this;		
		}
		
		public GearBox build() {
			return new GearBox(gear,clutch);
		}
		
	}

	public String toString() {
		return "GearBox [gear=" + gear + ", clutch=" + clutch + "]";
	}
	
}
