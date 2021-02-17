class PostJava5{
	public static void main(String[] args) {
		
		java.util.List<String> listOfNames = new java.util.ArrayList<String>();

		listOfNames.add("Rajiv");
		listOfNames.add("Reshma");
		listOfNames.add("Sana");
		listOfNames.add("Suhail");
		listOfNames.add("Kavitha");

		new PreJava5().doSomethingWithTheList(listOfNames);

		// for(String value : listOfNames){
		// 	System.out.println(value);
		// }

	}
}

// Imagine this class was written in the Pre-Generics World
class PreJava5{
	void doSomethingWithTheList(java.util.List list){
		for(int v = 0; v < list.size(); v++)
			System.out.println(list.get(v));

		// Changing the list
		list.add(456); //Surprisingly works
	}