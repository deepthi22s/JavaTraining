	// - Threads
	// 	- Running instance of a Program

	// A Thread in Java :
	// 	- a thread of execution
	// 	- an instance of the java.lang.Thread class

	// main thread

class MyFirstThread extends Thread{
public static void main(String[] args) {
	MyFirstThread thread = new MyFirstThread();
	thread.start(); //Indirectly calls run()
	System.out.println(Thread.currentThread().getName() + " running...");
}

@Override
public void run(){
	System.out.println(Thread.currentThread().getName() + " running....");
}


}

// Lifecycle of a Thread
	// START(Not Alive, Not Running) --->  RUNNABLE (Alive, Not Running) ----> RUNNING (Alive, Running) ---Optional---- Sleeping/Suspend/Waiting -------> DEAD