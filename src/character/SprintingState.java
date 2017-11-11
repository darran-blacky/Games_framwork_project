package character;

public class SprintingState implements State {
	public void doAction(Character character) {
		character.setState(this);
		character.setSpeed(4);
	}
	public String toString() {
		return "Sprinting State";
	}
}
