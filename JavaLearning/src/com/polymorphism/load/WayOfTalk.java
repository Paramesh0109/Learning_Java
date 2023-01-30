package com.polymorphism.load;

public class WayOfTalk {

	public void talk(Parents StyleOfTalk) {
		System.out.println("Polite, Respectfull");
	}
	public void talk(Partner StyleOfTalk) {
		System.out.println("Love, Romantic");
	}
	public void talk(Boss StyleOfTalk) {
		System.out.println("Nothing personal");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WayOfTalk talk = new WayOfTalk();
		Parents parents = new Parents();
		talk.talk(parents);
		
		Partner partner = new Partner();
		talk.talk(partner);		
		
		Boss boss = new Boss();
		talk.talk(boss);	
	}

}
