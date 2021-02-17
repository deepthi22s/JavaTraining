// - Inter-Thread Communication
// 	- wait(), notify(), notifyAll()   - java.lang.Object
// 		- Can only be called from within a synchronized context

class WaitNotifyWork{
		public static void main(String[] args) throws InterruptedException {
					int tot=0;
				
				//MyTask task = new MyTask();
				new Thread(new Runnable(){
					int tot=0;
					public void run(){
						for(int var = 1; var <= 100; var++){
							tot += var;
						}
						System.out.println(" Sum of first 100 numbers is : " +tot);
							// Send the notification to the waiting thread
					// 	synchronized(this){
					// 	System.out.println(Thread.currentThread().getName() + " is done with it's job, sending a notification to the waiting thread now to resume...");
					// 	 this.notify();
						}}).start();


		 //new Thread.start();

	// 	synchronized(task){//main gets the lock on the object reffered to by task
	// 	 System.out.println(Thread.currentThread().getName() + " about to go into waiting...");
	// 	task.wait(); //puts main to wait, and releases the lock as well...
	// 	 System.out.println(Thread.currentThread().getName() + " just woke up, resuming with the execution now...");
	// }
		
	}
}

