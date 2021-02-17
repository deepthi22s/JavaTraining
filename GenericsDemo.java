import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class GenericsDemo{
	public static void main(String[] args) {

		// Create a Integer only list
		List<Footballer> theList = new ArrayList<Footballer>();

		theList.add(new Footballer("Lionel Messi", 22, "Argentina"));
		theList.add(new Footballer("Zinadine Zidane", 123, "France"));
		theList.add(new Footballer("Mbappe", 24, "France"));
		theList.add(new Footballer("Angel Di Maria", 789, "Argentina"));
		theList.add(new Footballer("Klose", 221, "Germany"));

		// Collections.sort(theList); //No need to worry about the different types now


		for(Footballer theFootballer: theList){
			 System.out.println(theFootballer.getName());
		}

		//System.out.println("List : " + theList);
	}
}
