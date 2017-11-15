package character;

public interface Visitable {
	//allows any class that implements it to be visited by visitor
	public void accept (Visitor visit);

}
