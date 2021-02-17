packet deepthi1;
// Interfaces
//	- We can only have abstract methods here(before java 8)
//	- We can't instantiate a interface 
//  - All of the abstract methods coming down from a interface
//  - need to be defined in the sub class or the sub class also
//  - needs to be declared as abstract
//  - All methods in an interface are abstract by default
//  - Only constants allowed in a interface
//  - All methods in a interface are implicitly public 
interface Human{
	void eat();
	void sleep();
}

interface Employee{
	void workForWages();
	void sleep();
}

class Sakshi implements Human{
	@Override
	public void eat(){
		System.out.println("Sakshi's eat");
	}
	@Override
	public void sleep(){
		System.out.println("Sakshi's sleep");
	}
}



class Ramsha extends Sakshi{ //No errors here

}

class Nivedha implements Human, Employee{ //Possible here
	@Override
	public void eat(){
		System.out.println("Nivedha's eat");
	}
	@Override
	public void sleep(){
		System.out.println("Nivedha's sleep");
	}
	@Override
	public void workForWages(){
		System.out.println("Nivedha works now...");
	}
}

class InterfaceDemo{
	public static void main(String[] args) {
		Nivedha nivedha = new Nivedha();
		nivedha.eat();
		nivedha.sleep();
		nivedha.workForWages();
	}
}






// class A{
// 	private void func(){

// 	}
// }

// class B extends A{
// 	@Override
// 	void func(){

// 	}
// }


// Exceptional Scen