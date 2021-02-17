// Inheritance
// 	 - Code Inheritance (Class -> Class) IS-A

// 	 - Single Level
// 	 	- (super class)A <- B(sub class)
// 	 - Multi Level
// 	 	- A <- B <- C
// 	 - Multiple Inheritance
// 	 	- A     B
// 	 		 c


// Human - eat(), breathe(), sleep(), run(), walk(), smile()
// 	  - mouth, eyes, ears, legs, arms, fingers

// Deepthi - 

class Human{
	void breathe(){
		System.out.println("Generic breathe...");
	}
	void eat(){ //Overridden Method
		System.out.println("Generic eat...");
	}
	void sleep(){
		System.out.println("Generic sleep...");
	}
}

class Sneha extends Human{ // Single Level here
	@Override
	void eat(){ //Oveririding Method
		System.out.println("Sneha can eat now in her own way");
	}
	@Override
	void sleep(){ //Oveririding Method
		System.out.println("Sneha sleeps in her own particular way");
	}
}

class Nimitha extends Human{ // Single Level here
	@Override
	void sleep(){ //Overriding method
		System.out.println("Nimitha's own version of sleep...");
	}

	void sing(){
		System.out.println("Nimitha's own sing...");
	}
}

class Rishab extends Nimitha{ //Multi Level here

}


class Other{}

class InheritanceDemo extends Human{
	public static void main(String[] args) {
		InheritanceDemo sneha = new InheritanceDemo();
		sneha.eat();
		sneha.breathe();
		sneha.sleep();

		// new Nimitha().sleep();
		// nimitha.sing();
	}
}