package com.Gof.Adapter;

public class MainTest {

	public static void main(String[] args) {
		Player forwardPlayer = new Forwards("B");
		Player backPlayer = new Background("M");
		Player foreignCenterPlayer = new Translator("Y");
		forwardPlayer.Attack();
		backPlayer.Attack();
		foreignCenterPlayer.Attack();
	}

}
