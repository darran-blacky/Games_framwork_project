package character;

public class ConcreteVisitor implements Visitor {
	//implementation of the interface
	public void visit(Shape s) {
		s.accept(this);
	}

}
