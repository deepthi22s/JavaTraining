	// - implements Runnable
	// 	- public void run()

class MyRunnable implements Runnable{
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName() + " running...");
	}
}

class SecondTask implements Runnable{
	@Override
	public void run(){
		System.out.println("Different work in progress here...");
	}
}



class UsingThreadsWithRunnableDemo{
	public static void main(String[] args) {
		Thread theThread = new Thread(new SecondTask()); //Works
		theThread.setName("nikhil");
		theThread.start();
		SecondTask secondTask= new SecondTask();
		secondTask.run();
	}
}