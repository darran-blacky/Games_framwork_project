package interceptor;

public interface Interceptor {
	
		public void preControllerReply(ControllerReplyContext context);
		public void postControllerReply(ControllerReplyContext context);
		
}
