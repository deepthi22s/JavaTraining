class novel{
	int chapternos, pages;
	String words;
				
	void info(){

		System.out.println("The number of chapters are: "+chapternos+"\nthe number of pages are: "+pages);

	}
	
}
class ClassObjectDemo{
	
	public static void main(String[] args){
				novel HP1= new novel();
				HP1.chapternos= 70;
			 	HP1.pages= 500;
				HP1.words= "abcd";
				HP1.info();
	}
}