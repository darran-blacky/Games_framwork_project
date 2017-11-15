package character;

public interface Visitor {
// allows for creation of more visitors
	public void visit(Shape s);
}
