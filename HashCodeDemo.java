import java.util.HashSet;
import java.util.Comparator;
class Footballer{
	private String name;
	private int code;
	private String country;

	Footballer(String name, int code, String country){
		this.name = name;
		this.code = code;
		this.country = country;
	}

	public String getName(){
		return this.name;
	}

	public Integer getCode(){
		return this.code;
	}

	public String getCountry(){
		return this.country;
			}

	// @Override
	// public int compareTo(Object ob1){
	// 	 return this.getCode().compareTo(((Footballer)ob1).getCode());
	// 	//return ((Footballer)ob1).getCode().compareTo(this.getCode()); //Reverse sort
	// }


	@Override
	public String toString(){
		return "Footballer [name: " + this.getName() + ", code: " + this.getCode() + "]";
	}

	@Override
	public boolean equals(Object obj){
		return this.getCode().equals(((Footballer)obj).getCode());
	}


	@Override
	public int hashCode(){
		return this.getCode();
	}
}

class SortByCode implements Comparator<Footballer>{
	@Override
	public int compare(Footballer ref, Footballer secondRef){
		return ((Footballer)ref).getCode().compareTo(((Footballer)secondRef).getCode());
	}
}

class SortByName implements Comparator<Footballer>{
	@Override
	public int compare(Footballer ref, Footballer secondRef){
		return ((Footballer)ref).getName().compareTo(((Footballer)secondRef).getName());
	}
}

class SortByCountry implements Comparator<Footballer>{
	@Override
	public int compare(Footballer ref, Footballer secondRef){
		return ((Footballer)ref).getCountry().compareTo(((Footballer)secondRef).getCountry());
	}
}

class HashCodeDemo{
	public static void main(String[] args) {
		HashSet set = new HashSet();

		Footballer theFootballer = new Footballer("Messi", 6, "Argentina");

		// set.add(new Integer("56"));
		set.add(new Footballer("Iniesta", 4, "Spain"));
		set.add(new Footballer("Gerrad", 889, "England"));

		set.add(new Footballer("Iniesta", 4, "Spain"));

		set.add(theFootballer);

		System.out.println("List of Footballers:");

		for (Object ref : set) {
			System.out.println(ref);
			// if(ref instanceof Footballer)
			// 	System.out.println(((Footballer)ref).getName());
		}

	}
}

// 1. Enter new Employee Details
// 	Enter name:
// 		Shreya Kumar
// 	Enter Address:
// 		Pune
// 	Enter Code:
// 		3456
// 2. Display all employees
	
// 3. Update an Employee details:
// 	Enter code:
// 		67
// 4. Delete Employee details:
// 	Enter Code:
// 		56

// 5. Sort By First Name?
// 6. Sort By Last Name?
// 7. Sort By Address?
// 8. Sort by Code?