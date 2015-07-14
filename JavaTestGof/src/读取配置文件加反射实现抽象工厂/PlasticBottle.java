package 读取配置文件加反射实现抽象工厂;

public class PlasticBottle implements IBottle {

	@Override
	public void inWater() {
		System.out.println("往塑料瓶中倒入水");
		// TODO Auto-generated method stub

	}

	@Override
	public IBottle getBottle(int id) {
		System.out.println("得到一个塑料瓶子的对象");
		// TODO Auto-generated method stub
		return null;
	}

}
