package interceptor;

import java.util.ArrayList;

public class Dispatcher {
	// For future scalability
	private ArrayList<Interceptor> Interlopers = new ArrayList<>();

	public void regi(Interceptor interceptor, int position) {
		System.out.println(" Array position = " + position + "\n");
		Interlopers.add(position, interceptor);
		System.out.println(" Interceptor registered with dispatcher.... I think?\n");

	}

	public void unregi(int position) {
		Interlopers.remove(position);
		System.out.println("Inter Kicked out of dispatcher");
		
	}
	
	public void update(ContextInterface context, int position) {
		System.out.println("dispatcher update");
		Interlopers.get(position).log(context);
		
	}

}
