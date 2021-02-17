// Set - When duplicacy is a concern
import java.util.TreeSet;
class TreeSetDemo{
	public static void main(String[] args) {
		TreeSet set = new TreeSet();

		set.add(45);
		set.add(-98);
		set.add(0);
		set.add(123);
		set.add(8);
		// set.add(67.99); Won't work now
		if(!set.add(6)){ //No error, but doesn't store a duplicate value
			System.out.println("Value already exists in the set");
			}
		System.out.println("Set : " + set);

		for(Object ref : set){
			System.out.println(ref);
		}

	}
}