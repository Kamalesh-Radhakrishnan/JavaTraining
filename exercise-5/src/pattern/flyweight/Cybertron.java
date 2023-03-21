package pattern.flyweight;

import java.util.ArrayList;
import java.util.List;

class Cybertron {

	private final List<Transformer> registry = new ArrayList<>();
	
	public void createTransformer(String name,int id,String memory,Clan clan,Energon energon) {
		TransformerMemory clone = TransformerFactory.getTransformerMemory(memory.toLowerCase(),clan,energon);
		Transformer transformer = new Transformer(name,id,clone);
		registry.add(transformer);
	}
	
	public void displayTransformers() {
		registry.forEach(System.out::println);
	}
	
	
}
