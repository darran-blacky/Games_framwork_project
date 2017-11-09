package interceptor;

public class LoggingInterceptor implements Interceptor{

	@Override
	public void preControllerReply(ControllerReplyContext context) {
		// TODO Auto-generated method stub
		System.out.println("Create Character object of type: " + context.getCreatedCharacter() + " is Called! ");
	}

	@Override
	public void postControllerReply(ControllerReplyContext context) {
		// TODO Auto-generated method stub

		System.out.println("Character object of type: " + context.getCreatedCharacter() + " is created! ");
	}
	
}
