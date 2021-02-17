import java.util.Calendar;
class RandomNumbersAssignement extends Thread{
	long val=0;
	public static void main(String[] args){
			RandomNumbersAssignement random= new RandomNumbersAssignement();
			random.setName("random");
		random.start();
	}
	@Override
	public void run(){
		while(true){
			try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){
			System.out.println("Someone interuupted me :(");
		}
		Calendar date= Calendar.getInstance();
			long timemilli= date.getTimeInMillis();

				//date.getTimeInMillis();

				System.out.print("\r" +timemilli);
 
		
	}

	}
}