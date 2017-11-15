package interceptor;

import java.util.ArrayList;

public class Dispatcher {
	// For future scalability, when there are more interceptors
	private ArrayList<Interceptor> Interceptors = new ArrayList<>();
//registers interceptor with dispatcher
	public void regi(Interceptor interceptor, int position) {
		Interceptors.add(position, interceptor);
		System.out.println("Interceptor registered with dispatcher");

	}
// unbinds the interceptor with the dispatcher
	public void unregi(int position) {
		Interceptors.remove(position);
		System.out.println("Interceptor Kicked out of dispatcher");
		
	}
	//gets the interceptor
	public void update(ContextInterface context, int position) {
		Interceptors.get(position).log(context);
		
	}

}
