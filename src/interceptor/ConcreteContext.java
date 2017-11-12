package interceptor;

public class ConcreteContext implements ContextInterface {

	public String yoke;

	@Override
	public void createLog() {
		System.out.println("this is log place");

	}

	@Override
	public String getContextString() {

		return yoke;
	}

	@Override
	public void setContextString(String contextString) {
		this.yoke = contextString;

	}

}
