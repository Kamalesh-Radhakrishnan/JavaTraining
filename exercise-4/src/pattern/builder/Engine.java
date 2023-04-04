package pattern.builder;

class Engine {

	CrankShaft crankshaft;Pistons pistons;
	
	private Engine(CrankShaft crankshaft,Pistons pistons){
		this.crankshaft = crankshaft;
		this.pistons = pistons;
	}
	
	static class EngineBuilder{
		CrankShaft crankshaft;Pistons pistons;
		
		public EngineBuilder setCrankshaft(CrankShaft crankshaft) {
			this.crankshaft = crankshaft;
			return this;
		}
		
		public EngineBuilder setPistons(Pistons pistons) {
			this.pistons = pistons;
			return this;
		}
		
		public Engine build() {
			return new Engine(crankshaft,pistons);
		}
		
	}
	
	public String toString() {
		return "Engine [crankshaft=" + crankshaft + ", pistons=" + pistons + "]";
	}
	
}
