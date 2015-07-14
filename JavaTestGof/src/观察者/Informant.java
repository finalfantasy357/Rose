package 观察者;

public interface Informant {
	public void notifyObserver();
	
	public void setAction(String action);
	
	public String getAction();
	

}
