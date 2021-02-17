import java.util.Scanner;
class MySplit{
	public static void main(String[] args){
		
		System.out.println("Enter a string to perform split operation:");
		String str = new Scanner(System.in).nextLine();
		System.out.println("Enter a string at which you want the split end with the char you want to use as the dilemmeter");
		String op = new Scanner(System.in).nextLine();
        
		 mySplit(str,op);
		 

  	}  	public  static void mySplit(String str, String op){
  		str=str+op;// to end the loop
  		String []output= new String[str.length()];
      int i=str.indexOf(op),j=0;
  	   do	{
  				output[j]=str.substring(0, i);
  				str=str.substring(i+op.length());
  			
  				
  				i=str.indexOf(op);
  				j++;
  		 }while( i!=str.lastIndexOf(op));
       output[j]=str.substring(0,i);
       System.out.println(" The split values are:");
     for(int p=0; p!=(j+1); p++)
      System.out.println(output[p]);
      }
    	
	
} 
