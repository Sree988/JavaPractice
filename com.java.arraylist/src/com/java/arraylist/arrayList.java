package com.java.arraylist;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1=new ArrayList<>();
		ArrayList<Integer> l2=new ArrayList<>();
		l2.add(12);
		l2.add(56);
		l2.add(55);
		l1.add(6);
		l1.add(7);
		l1.add(4);
		l1.add(6);
		l1.add(5);
		//l1.add(2,2);
		//l1.addAll(l2);
		l1.addAll(0,l2);
		//l2.clear();
		//l2.clone();
		for (int i=0; i<l1.size();i++) {
			System.out.print(l1.get(i)+",");
			//System.out.print(" ");
		}
		//System.out.println(l2.contains(32));
		System.out.println(l1.lastIndexOf(6));
		
		
		
	}

}
