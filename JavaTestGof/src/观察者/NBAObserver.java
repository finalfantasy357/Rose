package 观察者;

public class NBAObserver extends Observer {

	public NBAObserver(String name, Secreatary sub) {
		super(name, sub);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		System.out.println(sub.getAction()+name+"别看NBA了");

	}

}
