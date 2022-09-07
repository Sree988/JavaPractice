package Inheritance;

public class harbivors extends animal{
	public void eat() {
		System.out.println("It eats grass.");
	}
	public static void main (String args[]) {
		harbivors cow =new harbivors();
		cow.walk();
		cow.eat();
	}

}
