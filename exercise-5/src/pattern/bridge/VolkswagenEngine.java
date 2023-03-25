package pattern.bridge;

class VolkswagenEngine implements VolkswagenParts {
	
	@Override
	public void build() {
		// TODO Auto-generated method stub
		System.out.println("W16 engine built by Volkswagen!");
		
	}
	
	void getEngine() {
		this.build();
	}
	
}
