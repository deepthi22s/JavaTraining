import java.util.Set;
import java.util.HashSet;
class GenericsFun{
	public static void main(String[] args) {
		Human []human = new Sneha[3];
		human[0] = new Sneha();
		human[1] = new Sneha();
		human[2] = new Divya(); //ArrayStoreException at runtime

		// Set<Human> set = new HashSet<Sneha>();//Polymorphic assignments dont work with Generics

		// set.add(new Sneha());
		// set.add(new Sneha());
		// set.add(new Divya());

	}
}

interface Human{
	void breathe();
}

class Sneha implements Human{
	@Override
	public void breathe(){
		System.out.println("Sneha's breathe...");
	}
}

class Divya implements Human{
	@Override
	public void breathe(){
		System.out.println("Divya's breathe...");

	}
}