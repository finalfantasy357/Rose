package 读取配置文件加反射实现抽象工厂;

public class IronBottle implements IBottle {

	@Override
	public void inWater() {
		System.out.println("往铁瓶子中倒入水");
		// TODO Auto-generated method stub

	}

	@Override
	public IBottle getBottle(int id) {
		System.out.println("得到一个铁瓶子对象");
		// TODO Auto-generated method stub
		return null;
	}

}
