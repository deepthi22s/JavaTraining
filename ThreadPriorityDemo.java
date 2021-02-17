// - Thread Priorities

	// 1-10




	// RUNNABLE -> t1(6), tr(7), th(5)
	// RUNNING -> th


class ThreadPriorityDemo{
	public static void main(String[] args) {

		MyTask task = new MyTask();

		Thread firstThread = new Thread(task);
		Thread secondThread = new Thread(task);

		firstThread.setName("supriya");
		secondThread.setName("rishabh");

		// Set the Priorities
		firstThread.setPriority(7);
		secondThread.setPriority(9);

		firstThread.start();
		secondThread.start();

		System.out.println(Thread.currentThread());
	}
}

class MyTask implements Runnable{
	@Override
	public void run(){
		System.out.println(Thread.currentThread());
	}
}