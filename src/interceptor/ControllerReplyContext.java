package interceptor;

import java.util.Date;
import character.Character;

public class ControllerReplyContext {
	
	private Character character;
	
	public ControllerReplyContext(Character name){
		this.character = character;
	}
	
	public String getCreatedCharacter(){
		return character.getName();
	}
	
}
