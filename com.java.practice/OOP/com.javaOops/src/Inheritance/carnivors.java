package Inheritance;

public class carnivors extends animal{
	public void eat() {
		System.out.println("It eats raw meat.");
	}
	public static void main(String args[]) {
		carnivors tiger = new carnivors();
		tiger.walk();
		tiger.eat();
	}

}
