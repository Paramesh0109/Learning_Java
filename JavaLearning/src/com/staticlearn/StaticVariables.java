package com.staticlearn;

public class StaticVariables {

	static int AccountBalance=0;
	String AccountName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub							

		StaticVariables obj1 = new StaticVariables();
		obj1.AccountBalance=1000;
		obj1.AccountName="Albie";

		StaticVariables obj2 = new StaticVariables(); 
		obj2.AccountBalance=2000;
		obj2.AccountName="Rinson";

		System.out.println("The First Object Balance is : " + obj1.AccountBalance);
		System.out.println("The First Object Name is : " + obj1.AccountName);
		System.out.println("The Second Object Balance is : " + obj2.AccountBalance);
		System.out.println("The Second Object Name is : " + obj2.AccountName);

	}

}
