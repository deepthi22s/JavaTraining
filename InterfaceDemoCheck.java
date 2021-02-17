package deepthi2
import deepthi1.human;
class InterfaceDemoCheck implements human {
	public static void main(String[] args) {
		InterfaceDemoCheck nivedha = new InterfaceDemoCheck();
		nivedha.eat();
		nivedha.sleep();
		

@Override
	public void eat(){
		System.out.println("Sakshi's eat");
	}
	@Override
	public void sleep(){
		System.out.println("Sakshi's sleep");
}