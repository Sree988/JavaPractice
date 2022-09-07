package polymorphism;

public class classB extends classA{
	
public void sum(int a,int b) {
	int sum=a+b;
	System.out.println(sum);
	}

public void sum(int a,int b, int c) {
	int sum=a+b+c;
	System.out.println(sum);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classB obj =new classB();
		obj.sum(2,3);

	}

}
