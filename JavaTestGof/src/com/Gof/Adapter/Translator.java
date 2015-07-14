package com.Gof.Adapter;

public class Translator extends Player {
	ForeignCenter fc = new ForeignCenter();

	public Translator(String name) {
		super(name);
		fc.setName(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		fc.进攻();
		// TODO Auto-generated method stub

	}

	@Override
	public void Defence() {
		fc.防守();
		// TODO Auto-generated method stub

	}

}
