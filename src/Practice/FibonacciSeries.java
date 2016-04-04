package Practice;
/**
 * Filename : FibonacciSeries.java
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class to find Fibonacci series up to first n terms 
 * @author arka
 * @version 5 April 2016
 */
public class FibonacciSeries {
	int var1, var2, var3;
	List<Integer> fibonacciNumbers;
	int numberOfTerms;
	/**
	 * Constructor method
	 * @param numberOfTerms
	 */
	public FibonacciSeries(int numberOfTerms) {
		fibonacciNumbers = new ArrayList<>();
		this.numberOfTerms = numberOfTerms;
		this.var1 = 1;
		this.var2 = 0;
	}
	
	/**
	 * Finds Fibonacci series
	 * @return : a list containing the fibonacci series
	 */
	public List<Integer> findFibonacciNumbers() {
		// calculate the fibonacci series in a different background thread
		FibonacciThread fibonacciThread = new FibonacciThread();
		Thread startFibonacciThread = new Thread(fibonacciThread);
		startFibonacciThread.start();
		try {
			startFibonacciThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fibonacciNumbers;
	}
	
	/**
	 * A Thread class to compute fibonacci series 
	 * @author arka
	 * @version 5 April 2016
	 */
	class FibonacciThread implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			fibonacciNumbers.add(0);
			for(int loopControl = 2; loopControl <= numberOfTerms; loopControl++) {
				var3 = var1 + var2;
				var1 = var2;
				var2 = var3;
				fibonacciNumbers.add(var3);
			}
		}
	}
	
	/**
	 * Driver method
	 * @param args
	 */
	public static void main(String args[]) {
		System.out.println(Arrays.toString(new FibonacciSeries(10).findFibonacciNumbers().toArray()));
	}
}
