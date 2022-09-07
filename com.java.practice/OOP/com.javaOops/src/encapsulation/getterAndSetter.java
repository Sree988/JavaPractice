package encapsulation;

public class getterAndSetter {
	
	String clientname;
	public void setClientName(String name) {
		clientname=name;
		//System.out.println("Out client is "+ name);
	}
	
	public String getClientName() {
		return clientname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getterAndSetter client1= new getterAndSetter();
		client1.setClientName("Hapco");
		System.out.println("Our client is " +client1.getClientName());
	}

}
