package testers;

import classes.Pair;

public class FibTester extends Pair<Integer>{

	public static void main(String[] args) {
		final int n = 50;
		
		long startTime = System.nanoTime();
		fib(n);
		long endTime = System.nanoTime();

		long duration = (endTime - startTime);
		System.out.println("First fibonacci's time execution: " + duration);
		
		
		startTime = System.nanoTime();
		fib2(n);
		endTime = System.nanoTime();

		duration = (endTime - startTime);
		System.out.println("Second fibonacci's time execution: " + duration);
	}
	
	static long fib(int n) { 
		if (n == 1 || n == 0) return 1; 
		else return fib(n-1) + fib(n-2); 
	}

	
	static Pair fib2(int n){
		if (n==0 || n==1) return new Pair(1, 1); 
		Pair<Integer> p = fib2(n-1); 
		return new Pair(p.getFirst() + p.second(), p.getFirst());
	}
}
