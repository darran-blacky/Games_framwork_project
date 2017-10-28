package character;
public class CharacterFactory{
	public Character makeCharacter(String newCharacter){
		if(newCharacter.equals("P")){
			return new Player();
		}else
		if(newCharacter.equals("E")){
			return new Enemy();
		}else
		if(newCharacter.equals("N")){
			return new NPC();
		}else return null;
	}
}