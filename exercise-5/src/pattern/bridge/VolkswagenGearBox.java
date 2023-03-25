package pattern.bridge;

class VolkswagenGearBox implements VolkswagenParts{

	@Override
	public void build() {
		// TODO Auto-generated method stub
		this.getGearBox();
	}
	
	void getGearBox() {
		System.out.println("GearBox made by Volkswagen!");
	}
	
}
