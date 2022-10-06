
import java.util.HashSet;
import java.util.Iterator;
public class HashingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		System.out.println((set));
		if(set.contains(1)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		if (!set.contains (6)) {
			System.out.println(("absolutely no"));
		}
		
		set.remove(1);
		if(!set.contains(1)){
			System.out.println("removed");
			System.out.println(set.size());
			System.out.println((set));
		}
		set.add(5);
		set.add(2);
		set.add(8);
		Iterator it= set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
