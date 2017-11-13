package interceptor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConcreteInterceptor implements Interceptor {

	private static final SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
	
	@Override
	public void log(ContextInterface context) {
		Date date = new Date();
		String sDate = format.format(date);
		context.setContextString("[LOGGING - " + sDate + "]: " + context.getContextString());
		context.createLog();
	}

}
