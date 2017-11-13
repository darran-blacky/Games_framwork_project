package interceptor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class ConcreteContext implements ContextInterface {
	public String data;
	
	public ConcreteContext(String data)
	{
		this.data = data;
	}

	@Override
	public void createLog() {
		//Log to Console.
		System.out.println(data);
		// Log to a file for reading post close of application.
		try {
		    BufferedWriter writer;
		    File file = new File("Log.txt");
		    if (file.exists())
		    	file.createNewFile();
	    	writer = new BufferedWriter(new FileWriter("Log.txt", true));
	    	writer.write(data);
	    	writer.newLine();
		     
		    writer.close();
		} catch (Exception e)
		{
			System.out.println("ERROR: problem with File writing... (" + e.getMessage() + ")");
		}
	}

	@Override
	public String getContextString() {
		return data;
	}

	@Override
	public void setContextString(String contextString) {
		this.data = contextString;
	}

}
