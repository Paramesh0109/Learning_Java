package com.javabasic;

public class ReturntypeLearn {

	public Integer ColloctAmt=1000;

	public Integer CollectAmtandGiveItToMe() {
		// TODO Auto-generated method stub
		System.out.println("Daddy have Collected Amount is " + ColloctAmt);
		return ColloctAmt;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturntypeLearn amt = new ReturntypeLearn();
		Integer giveamt =amt.CollectAmtandGiveItToMe();
		System.out.println("Got the Amount Son " + giveamt);


	}

}
