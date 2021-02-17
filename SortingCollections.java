import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class SortingCollections{
	public static void main(String[] args) {
		ArrayList<Footballer> listOfFootballers = new ArrayList<>();

		Footballer theFootballer = new Footballer("Gale", 14, "Wales");

		listOfFootballers.add(new Footballer("Angel Maria", 45, "Argentina"));
		listOfFootballers.add(new Footballer("Lionel Messi", 222, "Argentina"));
		listOfFootballers.add(new Footballer("Ronaldo", 21, "Portugal"));
		listOfFootballers.add(new Footballer("Ronaldo", 77, "Brazil"));
		listOfFootballers.add(new Footballer("Neymar", 21, "Brazil"));
		listOfFootballers.add(theFootballer);
		listOfFootballers.add(new Footballer("Saurez", 987, "Urugauy"));

		System.out.println("list before sorting : ");
		for(Object ref : listOfFootballers)
			System.out.print(((Footballer)ref).getName() + "\t");

		// Sort the list by code
		 // Collections.sort(listOfFootballers, new SortByCode());
		 // Collections.sort(listOfFootballers, new SortByName());
		 //Collections.sort(listOfFootballers, new SortByCountry());
		Comparator comp= ( ref, secondRef) -> {
		return ((Footballer)ref).getCountry().compareTo(((Footballer)secondRef).getCountry());};
			Collections.sort(listOfFootballers, comp);
		 System.out.println("\nAfter sorting, list : ");

		 for(Object ref : listOfFootballers)
			System.out.print(((Footballer)ref) + "\t");

		
	}
}


	// Comparable
	// 	- public int compareTo(Object obj)
	// 	{
	// 		//Define your custom sorting logic here
	// 	}

	// Comparator
	// 	- public int compare(Object ob1, Object ob2){