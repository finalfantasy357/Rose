package 动态代理;

public class RealSubject implements Subject {

	@Override
	public void doSomething() {
		System.out.println("做点傻事！");

	}

}
