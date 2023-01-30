package com.constractor.learn;

public class NoArguConst {

	int EmployeeID;
	String EmployeeName;

	NoArguConst(){
		EmployeeID=23;
		EmployeeName="Rinson";
		System.out.println("Employee account created");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoArguConst noargu = new NoArguConst();
		System.out.println(noargu.EmployeeID);
		System.out.println(noargu.EmployeeName);
	}

}
