interface Work{
	void doIt();
}


class Some{
	void doSomething(Work ref){
		ref.doIt();
	}
}


class ArgumentBasedAnnonymousInnerClassesDemo{
	public static void main(String[] args) {
		Some some = new Some();
		some.doSomething(new Work(){
			@Override
			public void doIt(){
				System.out.println("Truly magical stuff this...");
			}
		});

	}
}
