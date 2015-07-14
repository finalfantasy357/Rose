package 读取配置文件加反射实现抽象工厂;

public class TestFactory {

	public static void main(String[] args) {
		IBottle ibottle = Factory.getBottle();
		ibottle.inWater();

	}

}
