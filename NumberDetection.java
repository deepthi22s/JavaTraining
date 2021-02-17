import java.util.Scanner;
class NumberDetection{
	public static void main(String[] args){
					Scanner scan= new Scanner(System.in);
					 int []arr= new int[10];
					 int key,flag=0;
					System.out.println("Enter 10 numbers");
			 for (int i=0; i<arr.length; i++)
			 	arr[i]=scan.nextInt();
			 System.out.println("Enter the Key number");
			key=scan.nextInt();
				for(int j=0; j<10; j++,flag++){
					 	if(key==arr[j]){
					 		int num= j+1;
					 		System.out.println("Key Found at location" +num);
						break;
					 	} 
				
				}
			 if (flag==10)
			 {
			 	System.out.println("Key not found");
			 }

			 	
 
	}
}