import java.util.Scanner;
class CalculateMultiply{
	int total=1;
	int multiply(int... values){ // Thanks to Var-Args, this method
							     // can now take from 0-n int arguments
		if(values.length >= 2){
			for(int value : values){
				total *= value;
				}
				return total;
			}
			else if (values.length==1)
		return values[0];
	else
		return 0;
	}
	int input1(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		return(scan.nextInt());
	}
}


class VarArgDemo{
	public static void main(String[] args) {
		System.out.println("Multiplication of numbers : " +new CalculateMultiply().multiply(new CalculateMultiply().input1(),new CalculateMultiply().input1(),new CalculateMultiply().input1()));
		
	}
}