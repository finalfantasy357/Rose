package com.Gof.Adapter;

public class Background extends Player {

	public Background(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		System.out.println("后卫  进攻!"+name);
		// TODO Auto-generated method stub

	}

	@Override
	public void Defence() {
		System.out.println("后卫  防守!"+name);
		// TODO Auto-generated method stub

	}

}
