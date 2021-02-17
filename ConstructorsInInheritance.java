class A{
	A(boolean b){
		System.out.println("Inside A(boolean)..."); //1
	}
	A(){
		System.out.println("Inside A through b()..."); //1
	}
}
// java.lang.Object is the super class of every class in java


class B extends A{
	int flag=0;
	B(boolean flag){
		this();
		A ref= new A(false);
		System.out.println("Inside B(boolean)..."); //3
	}
	B(){
		
		System.out.println("Inside B()...");//2
		
	}
	
}

class ConstructorsInInheritance{
	public static void main(String[] args) {
		B b = new B(false);
	}
}