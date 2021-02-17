class WaitNotifyWorkDivija{
	public static void main(String[] args) throws InterruptedException{
		MyTask mytask=new MyTask();
		Thread thread=new Thread(mytask);
		thread.start();
		System.out.println(Thread.currentThread().getName() + " is running...");
		synchronized(mytask){
			mytask.wait();
			System.out.println(Thread.currentThread().getName() +" is now running by releasing wait...");
		}
			System.out.println("Subtraction of given numbers is : "+(mytask.num1 - mytask.num2));
	}
}
class MyTask implements Runnable{
	int num1,num2;
	public synchronized void run(){
		for(int var = 15; var <= 30; var++){
			num1 += var;
		}
		for(int var = 1; var <= 10; var++){
			num2 += var;
		}
		// Send the notification to the waiting thread
		System.out.println(Thread.currentThread().getName() + " is done with it's job, sending a notification to the waiting thread now to resume...");
		 this.notify();
	}
}