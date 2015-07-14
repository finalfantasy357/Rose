package com.Gof.Adapter;

public class Centers extends Player {

	public Centers(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		System.out.println("中锋  进攻!"+name);
		// TODO Auto-generated method stub

	}

	@Override
	public void Defence() {
		System.out.println("中锋  防守!"+name);
		// TODO Auto-generated method stub

	}

}
