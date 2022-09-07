package Abstraction;

public class machineTypeA extends machine{
	public void call() {
		System.out.println("It can call."); //It's not the actual project, just to check the functionality
	}
	public void calculate() {
		System.out.println("It can calculate.");
	}
	public static void main(String args[]) {
		machineTypeA typeA=new machineTypeA();
		typeA.call();
		typeA.move();
	}

}
