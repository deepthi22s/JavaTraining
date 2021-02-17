class WrapperWork{
		public static void main(String[] args) {
			// int var = new java.util.Scanner(System.in).nextInt();

			 Integer var = new Integer(new java.util.Scanner(System.in).nextInt());

			  var++; //Works after Java 5

			  System.out.println("var= " +var);

			 // WrapperWork work = new WrapperWork();

			 // System.out.println(work.incrementValueThePreJava5Way(var));



			 // System.out.println(var);

			// Double d = new Double("67.99");

			// System.out.println(d);
			
			// System.out.println("Length of number entered is : " + var.length());// Error, can't use . with primitives

		}

		Integer incrementValueThePreJava5Way(Integer value){
			// Convert the Wrapper into it's primitive equivelent
			int temp = value.intValue(); //UnWrap

			temp++; //Operate on it now

			value = new Integer(temp); //Re-Wrap

			return value;

		}



	}



	// Autoboxing and UnBoxing - Post Java 5



	// Wrapper Classes
		// boolean - Boolean
		// byte - Byte
		// short - Short
		// char - Character
		// int - Integer
		// long - Long
		// float - Float
		// double - Double