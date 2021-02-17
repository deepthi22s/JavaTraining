import java.util.Scanner;
class CalculateUsingMethodsWithParametersAndReturnType5{
	public static void main(String[] args) {
		
		new CalculateUsingMethodsWithParametersAndReturnType5().display();
		}

		
	int input(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		return(scan.nextInt());
		
	}

	int add(int firstNum, int secondValue){
		return (firstNum + secondValue);
	}
	void display(){
		
		System.out.println("Addition: " + new CalculateUsingMethodsWithParametersAndReturnType5().add(this.input(),new CalculateUsingMethodsWithParametersAndReturnType5().input()));

	}
}