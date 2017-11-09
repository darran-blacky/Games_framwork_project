package interceptor;

public class Test_interceptor {

	public static void main(String[] args) {

	//NOT FULLY IMPLEMENTED YET ..
		
	Interceptor interceptor = new Interceptor(){
		public void preControllerReply(ControllerReplyContext context){
			System.out.println("Create Character object of type: " + context.getCreatedCharacter() + " is Called! ");
		}
		public void postControllerReply(ControllerReplyContext context){
			System.out.println("Character object of type: " + context.getCreatedCharacter() + " is created! ");
		}
	};
	
	
	
	}

}
