package pattern.flyweight;

class TransformerMemory {

	String memory;
	Clan clan;
	Energon energon;
	
	TransformerMemory(String memory,Clan clan,Energon energon){
		this.memory = memory;
		this.clan = clan;
		this.energon = energon;
	}

	@Override
	public String toString() {
		return "TransformerMemory [memory=" + memory + ", clan=" + clan + ", energon=" + energon + "]";
	}
	
}
