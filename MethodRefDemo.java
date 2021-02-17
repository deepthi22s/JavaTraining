// - Method References
// 	- 

class MethodRefDemo{
	public static void main(String[] args) {
		// Using Inner classes
		// Thread thread = new Thread(new Runnable(){
		// 	@Override
		// 	public void run(){
		// 		MethodRefDemo.displayMessage();
		// 		// System.out.println("Thread working...");
		// 	}
		// });
		// thread.start();

		//Or using Java 8 lambda expression:
	// new Thread(() -> System.out.println("Works?")).start();
	// new Thread(() -> MethodRefDemo.displayMessage()).start();

	// OR Using Method References with lambdas
		
	new Thread(MethodRefDemo::displayMessage).start();  

														                //Static methods should be called by classname 
	//new Thread(new MethodRefDemo()::displayMessage).start(); // Error //only and not by ovjects, which we normally shouldnt but we could do it
														                // normal calling but here we cant do that, will show an error

	//Calling non-static methods with Method Reference syntax
	new Thread(new MethodRefDemo()::displayMessage1).start();

	}


	static void displayMessage(){
		System.out.println("We are moving ahead with lambdas...");
	}

	void displayMessage1(){
		System.out.println("We are moving ahead with lambdas...");
	}
}