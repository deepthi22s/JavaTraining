	// - Inner/Nested Classes
		// - Regular Inner Classes Or Inner Classes


		class Outer{

			private int b;

			class Inner{
				int b;

				void in(){
					int b = 9;
					System.out.println("Inside Inner's in()..., local b = " + b);//9
					System.out.println("instace b = " + this.b);//0
					System.out.println("Outer's b = " + Outer.this.b);//0
				}
			}

			void func(){
				// Inner i = new Inner();
				// i.in();
			}
		}



		class RegularInnerClassDemo{
			public static void main(String[] args) {
				// Outer out = new Outer();
				// Outer.Inner i = out.new Inner();

				// OR
				Outer.Inner i = new Outer().new Inner();


				i.in();



			}
		}