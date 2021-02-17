// - Supriya ---->Acc1
	// - Nikhil ---->Acc1


	// Nikhil checks the balance : 65,000/-

	// Nikhil makes the withdrawl : 40,000/-




	// Supriya checks the balance : 25,000/-

	// Supriya makes the withdrawl : 15,000/-



	// synchronized



class Task implements Runnable{
	@Override
	public synchronized void run(){
		for(int var = 1; var < 4; var++){
			System.out.println(Thread.currentThread().getName() + ", var : " + var);
		}
	}
}


class SynchronizedWork{
	public static void main(String[] args) {
		Task theTask = new Task();

		Thread first = new Thread(theTask);
		Thread second = new Thread(theTask);
		Thread third = new Thread(theTask);

		first.setName("sneha");
		second.setName("rishabh");
		third.setName("yaminee");

		first.start();
		second.start();
		third.start();
	}
}



