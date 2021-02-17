import java.util.Scanner;
class MyOwn<T>{// as the class Type
T instance; //this instance would be of T Type
MyOwn(T instance){//we can even use it as an argument's type
this.instance = instance;
}

public T getValue(){//We can even use it as a return type
return instance;
}

}

class TwoGenericTypeExample<T, E>{
	T firstInstance;
	E secondInstance;

	// E []anArrayOfEs; //We can even use them with Arrays

	TwoGenericTypeExample(T firstInstance, E secondInstance){
		this.firstInstance = firstInstance;
		this.secondInstance = secondInstance;
	}

	public T getFirstInstance(){
		return this.firstInstance;
	}

	public E getSecondInstance(){
		return this.secondInstance;
	}
}

class CustomGenericType{
	public static void main(String[] args) {
		// MyOwn<Footballer> ref = new MyOwn<>(new Footballer("Ronaldo", 22, "Portugal"));
		// System.out.println(ref.getValue());
		// Scanner scan= new Scanner(System.in);
		// System.out.println("Enter 2 Class types"); (this is error we can't declare the class type at Run Time )
		// String T= scan.nextLine();
		// String E= scan.nextLine();

		TwoGenericTypeExample<Double, String> ref = new TwoGenericTypeExample<>(56.99, "Exciting stuff this");
		System.out.println(ref.getFirstInstance());
		System.out.println(ref.getSecondInstance());
	}
}