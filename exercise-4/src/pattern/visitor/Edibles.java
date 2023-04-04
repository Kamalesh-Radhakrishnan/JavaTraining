package pattern.visitor;

interface Edibles {

	public float accept(CartVisitor visitor);
	
}
