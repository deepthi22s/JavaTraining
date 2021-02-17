import java.util.Scanner;
class PalandromeAssignment{
	public static void main(String[] args){
		System.out.println("Enter a string to check for palandrome");
		String str = new Scanner(System.in).nextLine();
		String rev="";

      // boolean flag=false;
      // for(int i=str.length()-1;i>=0;i--){
      // 	rev=rev+str.charAt(i);
      // }

     // flag= str.equals(rev);
		boolean flag=true;
      for(int i=str.length()-1, j=0 ; i>=0; i--, j++){
      	if(str.charAt(i)!= str.charAt(j))
      	{
      		flag=false;
      		break;
      	}
      }


      	if(flag==true)
      	System.out.println(" Yes");
      else
      	System.out.println("No");
	}
}