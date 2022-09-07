package Inheritance;

public class reptiles extends carnivors{
	public void walk() {
		System.out.println("It crawls.");
	}
	public static void main(String args[]) {
		reptiles snake =new reptiles();
		snake.eat();
		snake.walk();
	}

}
