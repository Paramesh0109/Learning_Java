package com.collection.learn;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearn {
	
	public void ArrayListEx(){
		
		List<String> arraylist = new ArrayList<String>();
		
		arraylist.add("benz");
		arraylist.add("Audi");
		arraylist.add("Ford");
		arraylist.add("BMW");
		arraylist.add("Ford");

		//Display the List of Array list
		System.out.println(arraylist);
		
		//Display the 2 index value
		System.out.println(arraylist.get(2));
		
		//Display the Index no of Value
		System.out.println(arraylist.indexOf("Audi"));
		
		//If we have Duplicate values, Display last index value 
		System.out.println(arraylist.lastIndexOf("Ford"));
		
		//Copy the List One to another
		List<String> arrayList2 = new ArrayList<String>();
		arrayList2.addAll(arraylist);
		System.out.println(arrayList2);
		
		//Clear List
		arrayList2.clear(); 
		System.out.println(arrayList2);
				
		// Remove the no 2 index value ion the list.
		arraylist.remove(2);
		System.out.println(arraylist);

		// Remove One list by name
		arraylist.remove("BMW");
		System.out.println(arraylist);
		
		//Add Null value
		arraylist.add(null);
		System.out.println(arraylist);
		
		//Update the list value
		arraylist.set(2, "BMW");
		System.out.println(arraylist);
		
		//Check List Empty or Not
		System.out.println(arraylist.isEmpty());
		
		// Iterate the List using by For Each Loop 
		System.out.println("------------------------------");
		for (String string : arraylist) {
			
			System.out.println("Using the For Each Loop : " + string);
		}
		
		// Iterate the List using by For Loop
		System.out.println("------------------------------");
		for (int i = 0; i <arraylist.size(); i++) {
		
			System.out.println("Using the For Loop : " + arraylist.get(i));
		}			
	}

	public static void main(String[] args) {
		
		ArrayListLearn al = new ArrayListLearn();
		al.ArrayListEx();		
	}
}
