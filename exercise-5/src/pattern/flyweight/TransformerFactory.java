package pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

class TransformerFactory {

	private static final Map<String,TransformerMemory> transformerMemories = new HashMap<>();
	
	public static TransformerMemory getTransformerMemory(String memory,Clan clan,Energon energon) {
		if(transformerMemories.get(memory) == null) {
			transformerMemories.put(memory,new TransformerMemory(memory,clan,energon));
			System.out.println("Transformer memory created ===> " + transformerMemories.get(memory));
		}
		return transformerMemories.get(memory);
	}
}
