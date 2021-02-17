import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;

class ArrayListDemo{
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		

		// Add elements to the list
		list.add(568); // list.add(new Integer("568"));
		
		list.add(2);
		list.add(98765);

		list.add("Deepthi");

		list.add(2);

		list.add(new ArrayListDemo());

		list.add(new Boolean(false));

		System.out.println("Size of list : " + list.size());

		list.add(31313);

		System.out.println("Size after adding one more object : " + list.size());
		System.out.println("List : " + list);

		// Delete from the list
		// list.remove(2);

		// Delete by value
		//list.removeAll(new Integer(2));

		// System.out.println("Size after deleting an object from the list : " + list.size());
		// System.out.println("List : " + list);

		// Traverse through the list
		// for(Object i : list){
		// 	System.out.println(i);
		// }

		// Access an object from the list at a particular location
		// System.out.println("Value at index 2 is : " + list.get(2));

		//Or in the Pre-Java5 times through a tradional for loop
		 // for(int i = 0; i < list.size(); i++){
		 // 	System.out.println(list.get(i));
		 // }

		 //Or in the Pre-Java5 times with an Iterator
		 // Iterator theIterator = list.iterator();
		 // while(theIterator.hasNext()){
		 // 	System.out.println(theIterator.next());
		 // }

		 //Coverting to Hashset to remove 
		HashSet hashSet= new HashSet(list);
		System.out.println("Coverting to Hashset to remove duplicacy ");
		for(Object i : hashSet){
			System.out.println(i);
		}


	}
}