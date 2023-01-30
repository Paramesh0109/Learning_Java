package com.condition.learn;

public class IfElseCondition {

	String SuperHero="Captain America";

	public void CheckCondition() {

		if(SuperHero.equals("Spider Man")){
			System.out.println("You thought about Spider Man");			
		} else if (SuperHero.equals("Hulk")) {
			System.out.println("You thought about Hulk");
		} else if (SuperHero.equals("Iron Man")) {
			System.out.println("You thought about Iron Man");
		} else if (SuperHero.equalsIgnoreCase("Captain america")) {
			System.out.println("You thought about Captain America");
		} else {
			System.out.println("Sorry i can't Guess !!!");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfElseCondition hero = new IfElseCondition();
		hero.CheckCondition();
	}

}
