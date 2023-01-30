package com.polymorphism.ride;

public class Son extends Parents {
	
	@Override
	public void Marriage() {
		System.out.println("Son! My Marriage My Rules");		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parents son = new Son();
		son.properties();
		son.Marriage();

	}

}
