// Abstract Class
// 	- can contain from 0-n number of abstract methods
// 	- can contain normal concrete methods as well
// 	- prefixed with the keyword abstract
// 	- cannot be instantiated, i.e we can't create objects of them
//  - All of the abstract methods coming down from a abstract class
//  - need to be defined in the sub class or the sub class also
//  - needs to be declared as abstract

abstract class Human{
	 abstract void eat(); //Error
	abstract void sleep();

	// We can even have normal concrete methods here
	void breathe(){
		System.out.println("Generic breathe...");
	}
}

class Nikhil extends Human{
	@Override
	void eat(){
		System.out.println("Nikhil's own way of eating");
	}
	@Override
	void sleep(){
		System.out.println("Nikhil sleeps in his own particular way");
	}
}

class AbstractDemo{
	public static void main(String[] args) {
		Nikhil nikhil = new Nikhil();
		nikhil.eat();
		nikhil.sleep();
		nikhil.breathe(); //Generic breathe

	//Human human = new Human();//Can't do this
	// 	 human.eat();
	// }
}
}