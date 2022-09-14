package com.java.Concept;

public class concept4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("Interviewbit");
		String b = new String("Interviewbit");
		String c = "Interviewbit";
		String d = "Interviewbit";
	}

}


//Total object created=3 becasue-
//Using the new keyword creates an object everytime. 
//Hence, 2 objects are created for first two statement. 
//Next, a string is declared which creates another object. 
//For the fourth statement, since, a string ”Interviewbit” already exists, it doesn’t create an additional object again. Hence, answer is 3.
