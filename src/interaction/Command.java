package interaction;

/*
 * Simple command interface with execute and undo operations
 */
public interface Command {
	
	public void execute();
	public void undo();
	 
}
