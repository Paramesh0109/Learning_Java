package com.staticlearn;

public class StaticMethod {
	
	public static void static_one() {
		
		System.out.println("The First Static Method");
	}
	
	public void static_two() {
		
		System.out.println("The Second Static Method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		static_one();
		
		StaticMethod sm = new StaticMethod();
		sm.static_two();
		
		

	}

}
