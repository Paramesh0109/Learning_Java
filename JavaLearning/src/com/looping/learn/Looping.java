package com.looping.learn;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 . For loop

		for (int times = 0; times < 10; times++) {		
			System.out.println("All Is Well");
		} 

		// 2 . While Loop

		int times = 0; 
		while (times<10) { 
			System.out.println("All Is Well"); 
			times++;
		}

		// 3. Do While Loop
		int times2 = 0;
		do {
			System.out.println("All Is Well");
			times2++;
		} while (times2<10);
	}

}
