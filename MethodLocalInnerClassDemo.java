class Outer{
	int var;
	void met(){
		int v = 90; //We can only access final or effectively
		             // final(After JAVA 8) variables of
		             // the enclosing method in a 
		             // Method Local Inner Class
		
		class Inner{ //Method Local Inner Class
			boolean b;
			void in(){
				System.out.println("Inside Inner's in()...., v = " + v);
			}
		}
		new Inner().in();

	}
}

class MethodLocalInnerClassDemo{
	public static void main(String[] args) {
		new Outer().met();
	}
}
