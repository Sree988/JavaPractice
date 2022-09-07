package Inheritance;

public class animal {
	
	 void walk() {
		System.out.println("It walks on four legs.");
	}
	
	 void eat() {
		System.out.println("It eats.");
	}
	
	public static void main (String args[]) {
		animal animal1=new animal();
		animal1.eat();
		animal1.walk();
	}
}