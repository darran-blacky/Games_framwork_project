package interceptor;

public class ConcreteInterceptor implements Interceptor {

	@Override
	public void log(ContextInterface context) {
		context.setContextString("Joseph Stalin");
		context.createLog();

	}

}
