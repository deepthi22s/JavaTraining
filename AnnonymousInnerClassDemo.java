interface Remote{
	void doSomething();
	default void hey(){
		System.out.println("Inside interface");
	}
}

class My{
	void func(){
		// I want to call Remote's doSomething()
		Remote ref = new Remote(){@Override public void doSomething(){System.out.println("Magical stuff this...");}};
		ref.doSomething();
		ref.hey();
	}
}

// 1. We are creating a new class - A class with no name, hence Annonymous
// 2. It is a sub class of the Type which is to the left of {
// 3. We have overridden the doSomething() method in this annonymous class
// 4. We are creating a reference variable of the interface Remote
// 5. We are creating a new object of this new Annonymous class
// 6. We have made ref refer to this new sub class object
// 7. We are termininating the line with ;




class AnnonymousInnerClassDemo{
	public static void main(String[] args) {
		new My().func();
	}
}