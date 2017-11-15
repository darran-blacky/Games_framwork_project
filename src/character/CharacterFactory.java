package character;
public class CharacterFactory {
	
	public CharacterFactory() {
	}
	/*
	 * @param entity
	 * 
	 */
	//use makeCharacter method to return an object of type Character
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
		return character;
	}
}











