
public class StaticFunctionCheck {
	int i=5;
	static int j=6;
	
	public static void main (String[] args) {
		//have to create object of the main class to call i as it is not static
		//System.out.println(StaticFunctionCheck.i);
		System.out.println(StaticFunctionCheck.j);
		
		//creating an object of the class
		StaticFunctionCheck statCheck =new StaticFunctionCheck();
		System.out.println(statCheck.i);
		
	}

}
