package interceptor;

import java.util.ArrayList;
import java.util.List;

public class GameRequestDispatcher implements Interceptor {

	List<Interceptor> interceptors = new ArrayList<Interceptor>();
	
	public void register(Interceptor interceptor){
		interceptors.add(interceptor);
	}
    
	public void remove(Interceptor interceptor){
		interceptors.remove(interceptor);
	}
	
	@Override
	public void preControllerReply(ControllerReplyContext context) {
		for(Interceptor interceptor: interceptors){
			interceptor.preControllerReply(context);
		}
	}

	@Override
	public void postControllerReply(ControllerReplyContext context) {
		for(Interceptor interceptor: interceptors){
			interceptor.postControllerReply(context);
		}
	}
}
