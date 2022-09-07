package Inheritance;

public class harbivors extends animal{
	void eat() {
		System.out.println("It eats greens vegetables and leaves");
	}
	public static void main(String args[]) {
		harbivors cow=new harbivors();
		cow.walk();
		cow.eat();
	}
}
