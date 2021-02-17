import java.util.Scanner;
class Novel{
	String name, genre, author;

	Novel(String name, String author, String genre){
		this.name=name;
		this.genre=genre;
		this.author=author;
	}

	public String getName(){
		return this.name;
	}

	public String getGenre(){
		return this.genre;
	}
	public String getAuthor(){
		return this.author;
	}
	@Override// overrides toString from Object Class
	public String toString(){
		return ("The Novel name is: " + this.getName() + "written by: " + this.getAuthor()+ "and the Author is:"+ this.getAuthor());
	}

}
class JavaBeanDemo2{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);

		for(int val=0;val<=2;val++){
		System.out.println("Enter book name, Author name and genre");
		Novel book1= new Novel(scan.nextLine(), scan.nextLine(), scan.nextLine());
		// Novel book2= new Novel("Good Vibes, Good Life ", "Vex King ", "Self Help");

		System.out.println(book1);
		// System.out.println(book2);
	}
	}
}