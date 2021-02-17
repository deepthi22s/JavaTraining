// Set - When duplicacy is a concern
import java.util.HashSet;
class HashSetDemo{
	public static void main(String[] args) {
		HashSet set = new HashSet();

		set.add("Sneha");
		set.add("Namitha");
		set.add("Ramesh");
		set.add(567.9890);
		if(!set.add("Sneha")){ //No error, but doesn't store a duplicate value
			System.out.println("Value already exists in the set");
			}
		System.out.println("Set : " + set);

		for(Object ref : set){
			System.out.println(ref);
		}

	}
}