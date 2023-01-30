package com.constractor.learn;

public class ArguConst {
	
	String AnimalName;
	String AnimalType;
	
	ArguConst(String name, String type){
		AnimalName=name;
		AnimalType=type;				
	}
	
	public void AnimalDetails() {
		System.out.println("The Animal Name is " + AnimalName + " type is " + AnimalType);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArguConst animal = new ArguConst("Duck", "Omnivores");
		animal.AnimalDetails();
		
		ArguConst animal1 = new ArguConst("Karadi", "Omnivores");
		animal1.AnimalDetails();

	}

}
