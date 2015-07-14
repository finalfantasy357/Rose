package 观察者;

import java.util.ArrayList;
import java.util.List;

public class Secreatary {
	private List<Observer> observerList = new ArrayList<Observer>();
	
	private String action;
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void addObserver(Observer o){
		observerList.add(o);
	}
	
	public void notifyObserver(){
		for(Observer o:observerList){
			o.update();
		}
	}
	
	

}
