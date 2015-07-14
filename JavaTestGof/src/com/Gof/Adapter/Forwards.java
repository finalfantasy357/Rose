package com.Gof.Adapter;

public class Forwards extends Player {

	public Forwards(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		System.out.println("前锋  进攻!"+name);
		// TODO Auto-generated method stub

	}

	@Override
	public void Defence() {
		System.out.println("前锋  防守!"+name);
		// TODO Auto-generated method stub

	}

}
