class Footballer{
	private String name, country;

	Footballer(String name, String country){
		this.name = name;
		this.country = country;
	}

	// public void setName(String name){
	// 	this.name = name;9
	// }

	// public void setCountry(String country){
	// 	this.country = country;
	// }

	public String getName(){
		return this.name;
	}

	public String getCountry(){
		return this.country;
	}

	// Override toString() for getting some meaningful information from the object

	@Override
	public String toString(){
		return "Hello I am " + this.getName() + " and I play proudly for " + this.getCountry();
	}


	@Override
	public boolean equals(Object obj){
		if(obj instanceof Footballer && this.getName().equals(((Footballer)obj).getName()) && this.getCountry().equals(((Footballer)obj).getCountry()))
			return true;
		else
			return false;
	}



}
class JavaBeanDemo{
	public static void main(String[] args) {
		Footballer theFootballer = new Footballer("Ronaldo", "Argentina");

		Footballer anotherFootballer = new Footballer("Ronaldo", "Portugal");

		// System.out.println(theFootballer);
		// System.out.println(anotherFootballer);

		// theFootballer---------->OBJECTOfFootballer
		// anotherFootballer------->OBJECTOfFootballer


		if(theFootballer.equals(anotherFootballer))//Compares references
			System.out.println("Same footballers");
		else
			System.out.println("Different footballers");


// System.out.println("Hello I am " + theFootballer.getName() + ", I play for " + theFootballer.getCountry());
// System.out.println("Hello I am " + anotherFootballer.getName() + ", I play for " + anotherFootballer.getCountry());

	}
}

class TennisPlayer{

}


	// public boolean equals(Object ref){
				// ==
	// }