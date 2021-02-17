class MultiThreadWork extends Thread{
	public static void main(String[] args) {
		MultiThreadWork thread1 = new MultiThreadWork();
		
		MultiThreadWork thread3 = new MultiThreadWork();

		thread1.setName("sneha");
		
		thread3.setName("nikhal");

		thread1.start();
		
		thread3.start();
	}

@Override
public void run(){
	// for(int var = 1; var < 4;  var++)
		System.out.println(Thread.currentThread().getName() + " running " );
			if(Thread.currentThread().getName()=="sneha"){
				MultiThreadWork thread2 = new MultiThreadWork();
				thread2.setName("yaminee");
				thread2.start();
			}
}


}