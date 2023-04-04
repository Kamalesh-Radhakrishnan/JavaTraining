package pattern.visitor;

interface CartVisitor {

	float visit(Fruit fruit);
	float visit(Vegetable vegetable);
	
}
