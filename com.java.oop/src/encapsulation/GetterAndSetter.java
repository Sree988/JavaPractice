package encapsulation;

public class GetterAndSetter {
	String ClientName;
	public void setClientName(String name) {
		ClientName=name;
	}
	
	
	public String getClientName() {
		return ClientName;
	}
	
	public static void main(String args[]) {
		GetterAndSetter a = new GetterAndSetter();
		a.setClientName("Hapco");
		System.out.println(a.getClientName());
	}

}
