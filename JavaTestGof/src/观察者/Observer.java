package 观察者;

public abstract class Observer {
	String name;
	Secreatary sub;
	
	public Observer(String name,Secreatary sub){
		this.name = name;
		this.sub = sub;
	}

	public abstract void update();
}
