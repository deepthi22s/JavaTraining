class ThreadSleepDemo extends Thread{
	public static void main(String[] args) throws InterruptedException {
		ThreadSleepDemo ref = new ThreadSleepDemo();
		ref.setName("yaminee");
		ref.start();
		// Thread.sleep(5000); //Thread.sleep(5000);
	}


	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " about to go to sleep for 5 seconds...");
		// Put the currently executing thread:yaminee to the sleeping state for 5 seconds
		try{
		Thread.sleep(5000);
	}catch(InterruptedException ie){
		System.out.println("Someone interuupted me :(");
	}
		System.out.println(Thread.currentThread().getName() + " just woke up...");
	}

}


// Create a Timer
// Prints Random numbers