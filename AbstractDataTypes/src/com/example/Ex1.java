package com.example;

abstract class AC {
	public abstract void am();

	void nm() {
	}
}

class C extends AC {
	public void am() {
	}
}

//----------------------------------------

interface I {
	void am();
}

class CC implements I {
	public void am() {

	}
}

//----------------------------------------

public class Ex1 {

	public static void main(String[] args) {

		AC ac = new C();
		I i = new CC();

	}

}
