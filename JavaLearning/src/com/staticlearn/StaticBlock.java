package com.staticlearn;

public class StaticBlock {

	static {
		System.out.println("This is First");
	}
	static {
		System.out.println("This is Second");
	}
	static {
		System.out.println("This is Third");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is Last");
	}

}
