package com.constractor.learn;

public class ConstOverload {

	String Draw;

	ConstOverload() {

		System.out.println("Draw Object created");
	}

	ConstOverload(String ToDraw) {
		System.out.println("Drawing " + ToDraw);		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstOverload draw = new ConstOverload();
		ConstOverload draw1 = new ConstOverload("Circle");
	}

}
