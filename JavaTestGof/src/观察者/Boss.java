package 观察者;

public class Boss implements Informant {
	
	private String action;

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String getAction() {
		return action;
	}

}
