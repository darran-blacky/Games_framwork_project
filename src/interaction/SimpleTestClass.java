package interaction;
import character.Character;
import character.CharacterFactory;

public class SimpleTestClass {

	public static void main (String args []){
		//CharacterFactory Factory
		CharacterFactory cf = new CharacterFactory();
		
		//Keyboard Invoker
		Keyboard_input keyboard = new Keyboard_input();
		
		//PLAYER Receiver
		Character player = cf.makeCharacter("P");
		
		//MOVE_LEFT Concrete command
		button_A left = new button_A(player);
		
		//MOVE_RIGHT Concrete command
		button_D right = new button_D(player);
		
		//MOVE_UP Concrete command
		button_W up = new button_W(player);
				
		//MOVE_DOWN Concrete command
		button_S down = new button_S(player);
		
		//Shoot Concrete command
		button_shoot shoot = new button_shoot(player);
		
		//Tests 
		keyboard.setCommand(left);
		keyboard.buttonPressed();
		
		keyboard.setCommand(right);
		keyboard.buttonPressed();
		
		keyboard.setCommand(up);
		keyboard.buttonPressed();
		
		keyboard.setCommand(down);
		keyboard.buttonPressed();
		
		keyboard.setCommand(shoot);
		keyboard.buttonPressed();
	}
}
