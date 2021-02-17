	// Enumerations - Java 5.0

	// enum identifier{Const, Const, Const}

enum PizzaSize{SMALL(new int[]{1,2,3}), MEDIUM(new int[]{3}), LARGE(new int[]{4});
	private int []size;
	PizzaSize(int []size){
		this.size = size;
	}

	public int[] getSize(){
		return this.size;
	}
	
	
}

class PizzShop{
	void getMenu(){
		// PizzaSize size = PizzaSize.SMALL;
		// System.out.println(size);
		// size = PizzaSize.MEDIUM;
		// System.out.println(size);
		System.out.println("Dear Customer, we have the following sizes available for Pizza:");
		PizzaSize []values = PizzaSize.values();
		// for(int v = 0; v < values.length; v++){
		// 	System.out.println(values[v]);
		// }
		// for(PizzaSize size : values){

		// 	System.out.println(size + " serves "+size.getSize());
		// }
		for(PizzaSize size : values){
			System.out.println("For Size : " + size);
			for(int value: size.getSize()){
				System.out.print(value + " ");
			}
			System.out.println("");
		}
	}

	// int PizzShop;{
	// 	int tot=0;
	// 	PizzaSize []values = PizzaSize.values();
	// 	for (PizzaSize val : values) {
	// 		tot+=val.getSize();
			
// 		}
// 		System.out.println("The total :"+tot);
// 	}
}

class EnumDemo{
	public static void main(String[] args) {
		new PizzShop().getMenu();
		new PizzShop();
	}
}

	