package 观察者;

public class Test {

	public static void main(String[] args) {
		Secreatary secreatary = new Secreatary();
		
		Observer o1 = new NBAObserver("NBA1", secreatary);
		Observer o2 = new NBAObserver("NBA2", secreatary);
		Observer o3 = new StockObserver("Stock1", secreatary);
		Observer o4 = new StockObserver("Stock2", secreatary);
		
		secreatary.addObserver(o1);
		secreatary.addObserver(o2);
		secreatary.addObserver(o3);
		secreatary.addObserver(o4);
		
		secreatary.setAction("老板回来了");
		secreatary.notifyObserver();
		
	}

}
