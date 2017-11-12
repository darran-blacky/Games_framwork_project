package character;

public class ConcreteVisitor implements Visitor {
	
	public void visit(Shape s) {
		s.accept(this);
	}

}
