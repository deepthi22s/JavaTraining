// - Lambda expressions -> Java 8
	// 	- Annonymous functions
	// 	- Short, consise and smarter code
	// 	- Works only with Functional Interfaces


@FunctionalInterface //Advisable but optional
interface Fab{
	void doWork();
	default void doSomething(){
		System.out.println("default met");
	}

}

@FunctionalInterface
interface Time{
	void click(int minutes, int seconds);
}


class LambdasWork{
	public static void main(String[] args) {
		// Fab ref = new Fab(){
		// 	@Override
		// 	public void doWork(){
		// 		System.out.println("Works...");
		// 	}
		// };
		// ref.doWork();

		// With Lambdas
		// FunctionalInterfaceName refVariable = () -> Statement;
		// ref.methodName()

		 //Fab fabulous = () -> System.out.println("Absolutely Magical!");
		//Or with multiple statements in the overriding method:
		Fab fabulous = () -> {
			System.out.println("Absolutely Magical!");
			System.out.println("multiple statements");
			//Cant override other default methods
		};
		fabulous.doWork();
		fabulous.doSomething();

		// Time ref = (int minutes, int seconds) -> System.out.println("Minutes : " + minutes + ", Seconds : " + seconds);
		// OR:
		Time ref = (minutes, seconds) -> {System.out.println("Minutes : " + minutes + ", Seconds : " + seconds);


			};
		ref.click(45, 20);
	}
}