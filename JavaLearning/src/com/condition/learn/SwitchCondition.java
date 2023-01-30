package com.condition.learn;

public class SwitchCondition {
	
	String Hero = "Spider Man"; 
	
	public void AboutHero() {
		
		switch (Hero) {
		case "Iron Man":
			System.out.println("Iron Man is Super hero");
			break;
		case "Captain America":
			System.out.println("Captain America is Super hero");
			break;
		case "Hulk":
			System.out.println("Hulk is strength Man");
			break;
		case "Spider Man":
			System.out.println("Spider Man is Super hero");
			break;
		case "Bat Man":
			System.out.println("Bat Man is Black hero");
			break;
		case "Thor":
			System.out.println("Thor is strength hero");
			break;
			
		default:
			System.out.println("Sorry I dont know about this person");
		}
		
	}
			
	public static void main(String[] args) {
		
		SwitchCondition sc = new SwitchCondition();
		sc.AboutHero();
		

	}

}
