import java.util.*;
public class HashingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map=new HashMap<>();
		map.put("India",120);
		map.put("US",30);
		map.put("China",150);
		System.out.println(map);
		
		map.put("China", 180);
		System.out.println(map);
		
		if(map.containsKey("China")) {
			System.out.println("present key");
			System.out.println(map.get("China"));
		}else {
			System.out.println("not present");
		}if (!map.containsKey("Indo")){
			System.out.println(map.get("Indo"));
		}
		
		//1st process
//		for(Map.Entry<String, Integer>e:map.entrySet()) {
//			System.out.print((e.getKey()+ " "));
//			System.out.print((e.getValue()));
//			System.out.println(" ");
//		}
		//2nd process
//		Set<String> keys=map.keySet();
//		for(String key : keys) {
//			System.out.println(key+" "+map.get(key));
//		}
		
		map.remove("China");
		System.out.println(map);
	}

}
