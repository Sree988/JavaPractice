package Inheritance;

public class reptiles extends carnivors{
	void walk() {
		System.out.println("It crawls");
	}
	
	public static void main(String args[]) {
		reptiles snakes= new reptiles();
		snakes.walk();
		snakes.eat();
	}
	

}
