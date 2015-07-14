package 读取配置文件加反射实现抽象工厂;

public class PlasticKettle implements IKettle {

	@Override
	public void inWater() {
		System.out.println("往塑料水壶中倒入水");
		// TODO Auto-generated method stub

	}

	@Override
	public void outWater() {
		System.out.println("把塑料水壶中水倒掉");
		// TODO Auto-generated method stub

	}

}
