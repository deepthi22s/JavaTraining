interface Human{
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
		System.out.println("deep's eat");
	}
	@Override
	public void sleep(){
		System.out.println("deep's sleep");
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



class Ramsha extends Sakshi{ //No errors here
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

class RuntimePolymorphismDemo{
	public static void main(String[] args) {
		// Nivedha nivedha = new Nivedha();
		// nivedha.eat();
		// nivedha.sleep();
		// nivedha.workForWages();


		// Human ref = new Human(); Can't do that

		Human ref = new Sakshi(); //Creating a reference variable of Human

		//Sakshi sakshi = new Sakshi();

		// ref = sakshi; //IS-A

		ref.eat(); //Sakshi's eat would be called
		ref.sleep(); //Sakshi's sleep would be called

		//Ramsha ramsha = new Ramsha();

		ref = new Ramsha(); //IS-A

		ref.eat(); //Ramsha's eat would be called here
		ref.sleep(); //Ramsha's sleep being called
		//ref.sing(); //Error here
		Fighter deeps= new Deepthi();
		deeps.eat();
		deeps.sleep();
		deeps.fightWell();

	}
}

