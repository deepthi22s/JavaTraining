import java.util.Scanner;
class LengthOfVar{
	public static void main(String[] args){
		int var= new Scanner(System.in).nextInt();
		int flag=0;
		while(var!=0)
		{
			var=var/10;
			flag++;
		}
		System.out.println(flag)	;
	}
}