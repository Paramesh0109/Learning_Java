package com.javabasic;

public class DatatypeLearn {
	
	
	long accountno=123456789l;
	String AccountName="ALbiewaran";
	float AccountBalance=100000;
	
	public void BankDetails() {
		
		System.out.println("The Acount Number is : " + accountno );
		System.out.println("The Acount Name is : " + AccountName);
		System.out.println("The Acount Balance is : " + AccountBalance);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DatatypeLearn bank = new DatatypeLearn();
		bank.BankDetails();
		

	}

}
