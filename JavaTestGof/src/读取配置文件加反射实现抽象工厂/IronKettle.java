package 读取配置文件加反射实现抽象工厂;

public class IronKettle implements IKettle {

	@Override
	public void inWater() {
		System.out.println("往铁水壶中倒入水");

	}

	@Override
	public void outWater() {
		System.out.println("把铁水壶中水倒掉");
		// TODO Auto-generated method stub

	}

}
