package Abstraction;

abstract public class machine {
	public void clean() {
		System.out.println("It can clean.");
	}
	
	public void move() {
		System.out.println("It can move.");
	}
	
	abstract public void calculate();
	
	abstract public void call();
}
