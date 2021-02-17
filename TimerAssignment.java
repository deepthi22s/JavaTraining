class TimerAssignment extends Thread{
	public static void main(String[] args){
		TimerAssignment th1= new TimerAssignment();
		th1.setName("timing");
		th1.start();
		// System.out.println(Thread.activeCount());

	}
	@Override
			public void run(){
	
	int val=0;
		
		while(true){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				System.out.println("Someone interuupted me :(");
			}
			System.out.print("\r" +val++);
			
			}
			}
}

