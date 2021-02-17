// forEach() - Java 8 and above
import java.util.List;
import java.util.ArrayList;
class Java8ForEachDemo{
	public static void main(String[] args) {
		List<String> listOfNames = new ArrayList<>();

		listOfNames.add("Rishabh");
		listOfNames.add("Yaminee");
		listOfNames.add("Divija");
		listOfNames.add("Sakshi");
		listOfNames.add("Nikhita");
		listOfNames.add("Nikhil");

		// Traverse through the list by enhanced for loop:
		// for(String name : listOfNames){
		// 	System.out.println(name);
		// }

		// Traverse through the list by using the new Java 8 forEach
		// listOfNames.forEach(value -> System.out.println(value));

		// Or using Method References with the forEach
		listOfNames.forEach(System.out::println);
	}
}