package pattern.flyweight;

class Transformer {

	String name;
	int id;
	TransformerMemory transformerMemory;
	
	Transformer(String name,int id,TransformerMemory transformerMemory){
		this.name = name;
		this.id = id;
		this.transformerMemory = transformerMemory;
	}

	@Override
	public String toString() {
		return "Transformer [name=" + name + ", id=" + id + ", transformerMemory=" + transformerMemory + "]";
	}
	
	
}
