package Abstractioninterfaces;

interface interfaces {
	//all the methods have to be abstracr method
	
	public void method();

	}

	class Subclass implements interfaces{
		public void method() {
			System.out.println("this is the method");
		}
	}

	class implementation{
		public static void main(String [] args) {
			interfaces obj=new Subclass();
			obj.method();
		}
	}

