class CalculateDivision{
	void divide(int firstNum, int secondNum){
		int result = 0;
		try{
		result = firstNum / secondNum;
		System.out.println("Division of numbers : " + result);
	}catch(ArithmeticException ae){
		System.out.println("Sorry, division by 0 not defined yet... : " + ae.getMessage());
	}
		// System.out.println("This always runs...");

	
	}
}

// finally{} always runs! Even in the case of a return statement in the method,
// finally{} still runs - Right after the call to return is encountered but
// before it is executed

class ExceptionHandlingStarter{
	public static void main(String[] args) {
		// System.out.println("Please enter the two numbers to divide (PLEASE Don't enter the second value as 0)");

		// java.util.Scanner scan = new java.util.Scanner(System.in);

		// int firstNum = scan.nextInt();
		// int secondNum = scan.nextInt();

		// new CalculateDivision().divide(firstNum, secondNum);
		new ExceptionHandlingStarter().func();
	}

	void func(){
		try{
		this.func();
		}catch(StackOverflowError se){
			System.out.println("Sorry, we have run out of memory...");
		}
	}



}