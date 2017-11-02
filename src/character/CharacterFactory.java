package character;

public class CharacterFactory {
	public Character makeCharacter(String entity) {	
		if(entity.equals("p")) {
			return  new Player(400,300,"PLAYER");
		}
		else if(entity.equals("e")) {
			return  new Enemy(200,100, "ENEMY");
		}
		
		else if(entity.equals("n")) {
			return  new NPC(350,250,"NPC");
		}
		else return null;
	}
}
