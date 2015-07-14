package 读取配置文件加反射实现抽象工厂;

public interface IBottle {
	public void inWater();
	public IBottle getBottle(int id);

}
