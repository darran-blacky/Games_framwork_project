package character;
import java.util.Scanner;

//import HUD.Window;
public class FactoryTest{
	public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
	private static Scanner userInput;
	public static void main(String [] args){
		CharacterFactory cf = new CharacterFactory();
		 //new Window(WIDTH,HEIGHT,"Game Framework Demo!");
		Character character = null;
		userInput = new Scanner(System.in);
		System.out.print("What type of character? (P/E/N)");
			if(userInput.hasNextLine()){
				String type = userInput.nextLine();
				type.toUpperCase();
				character = cf.makeCharacter(type);
				if(character != null){
					doChar(character);
				}else System.out.println("Error");
			}
	}
	public static void doChar(Character aChar){
			aChar.displayCharacter();
		}
}