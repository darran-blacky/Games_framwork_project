package character;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
	private static CharacterFactory characterFactory;
	private Map<String, Character> characterPool;
	
	public CharacterFactory() {
		characterPool = new HashMap<String, Character>();
	}
	
	public static CharacterFactory getInstance() {
		if (characterFactory == null) {
			characterFactory = new CharacterFactory();
		}
		return characterFactory;
	}
	
	
	public Character makeCharacter(String entity, DrawingAPI d_api) {
		Character character;	
			
			
			if(entity.equals("p")) {
			    character = new Player(400,300,"PLAYER" , d_api);
			}
			else if(entity.equals("e")) {
				character =  new Enemy(200,100, "ENEMY" , d_api);
			}
			
			else if(entity.equals("n")) {
				character =  new NPC(350,250,"NPC" , d_api);
			}
			else{
				character = null;
			}
			characterPool.put(entity, character);
		return character;
	}
}











