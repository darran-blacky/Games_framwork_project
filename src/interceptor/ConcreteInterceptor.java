package interceptor;

import java.text.SimpleDateFormat;
import java.util.Date;
//concrete interceptor for formating
public class ConcreteInterceptor implements Interceptor {
	// to get the exact time in a readable format 
	private static final SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
	//formating for the log in the form of [ Logging - hh : mm : ss] : .........
	@Override
	public void log(ContextInterface context) {
		Date date = new Date();
		String sDate = format.format(date);
		context.setContextString("[LOGGING - " + sDate + "]: " + context.getContextString());
		context.createLog();
	}

}
