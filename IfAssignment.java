class IfAssignment{
	public static void main( String[] args){
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		int c= Integer.parseInt(args[2]);
		int sum= a + b+ c, flag=0;
		
						if(a>=40) flag++;
								
						if(b>=40) flag++;
							
						if(c>=40) flag++;
								
						 if(sum>=125) flag++;

						 	if(flag==4)
							System.out.println("student is passed");
							else 
								System.out.println("student is failed");	
	

}
}