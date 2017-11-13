package character;

public class WalkingState implements State{
	public void doAction(Character character) {
		character.setState(this);
		character.setSpeed(2);
	}
	public String toString() {
		return "Walking State";
	}
}
