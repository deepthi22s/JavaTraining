interface Human{
	int vr = 987; //public static final - by defualt
	void eat();
	void sleep();
	default void walk(){ //Only works post java 8.0
		System.out.println("Works after Java 8...");
	}
}

interface Employee{
	void workForWages();
	void sleep();
}

interface Fighter extends Human{
	void fightWell();
}

class Deepthi implements Fighter{
	@Override
	public void eat(){
		System.out.println("Sakshi's eat");
	}
	@Override
	public void sleep(){
		System.out.println("Sakshi's sleep");
	}
	@Override
	public void fightWell(){
		System.out.println("Deepthi is a real warrior :)");
	}
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



class Ramsha implements Human{ //No errors here
	void sing(){
		System.out.println("Ramsha sings well...");
	}
	@Override
	public void eat(){
		System.out.println("Ramsha's eat");
	}
	@Override
	public void sleep(){
		System.out.println("Ramsha's sleep");
	}
}


class Bird{

}

class ArrayObjectCallingDemo{
	public static void main(String[] args) {
		


		// Human ref = new Human(); Can't do that

		// Human ref = new Sakshi(); //Creating a reference variable of Human

		//Sakshi sakshi = neww Sakshi();

		// ref = sakshi; //IS-A

		// ref.eat(); //Sakshi's eat would be called
		// ref.sleep(); //Sakshi's sleep would be called

		//Ramsha ramsha = new Ramsha();

		// ref = new Ramsha(); //IS-A

		// ref.eat(); //Ramsha's eat would be called here
		// ref.sleep(); //Ramsha's sleep being called
		//ref.sing(); //Error here


		Human []refs = new Human[3]; //Works

		refs[0] = new Sakshi(); // IS- A -> Human

		refs[1] = new Ramsha(); // IS- A -> Human

		refs[2] = new Sakshi(); // IS-A -> Human

		for(Human ref : refs){
			ref.sleep();
			ref.eat();
			if(ref instanceof Ramsha)
				((Ramsha)ref).sing();
			}
		}












	}
