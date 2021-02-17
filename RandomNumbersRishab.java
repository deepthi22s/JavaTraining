import java.util.Date;
import java.util.Scanner;

class RandomNumbersRishab extends Thread{
	public static void main(String[] args){
		int randomCount = 0, rangeEnd = 0, secondsValue = 0;
		long timeValue = 0;
		
		Scanner scan = new Scanner(System.in);
		RandomNumbersRishab timer = new RandomNumbersRishab();
		GeneratorFunctionality genOne = new GeneratorFunctionality();
		
		Date d = new Date();
		timeValue = d.getTime();
		int randomValue = genOne.generateSeed(timeValue);
		System.out.println("The random value generated are : " + randomValue);
		timer.start();

		while(true) {
			randomValue = genOne.generateNumber(randomValue);
			System.out.println(randomValue);
			timer.run();
		}
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);	
		}catch(InterruptedException ie){
			System.out.println("The thread has been interrupted.");
		}
	}	
}
// Middle Square Algorithm
class GeneratorFunctionality {
	int generateNumber(int remainder) {
		int squareValue = remainder*remainder;
		int centerValue = squareValue%100000;
		centerValue/=100;
		if(centerValue<100){
			centerValue*=10;
		}
		if(centerValue<10){
			centerValue*=100;
		}
		return centerValue;
	}	

	int generateSeed(long timeValue){
		int remainder = ((int)timeValue)%1000;
		int randomSeed = this.generateNumber(remainder);
		return randomSeed;
	}
}