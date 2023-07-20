package Recursion;

import java.util.Arrays;

public class FibonacciSeries {

	static int n = 30;
	
	//Iterative method
	static int f1(int n) {
		int t0=0, t1=1, result = 0;
		
		if(n<=1) return n;
		
		for(int i=2;i<=n;i++) {
			result=t0+t1;
			t0=t1;
			t1=result;
		}
		return result;
		
	}
	
	
	/**
	 * Recursive call
	 * 
	 * Excessive recursion as it will duplicate recursive calls
	 * multiple times
	 * 
	 * Time Complexity: O(2^n)
	 * 
	 * return n if n<=1
	 * return f(n-2)+f(n-1) if n>1
	 * 
	 * @param args
	 */
	static int f2(int n) {
		
		if(n<=1) return n;
		
		return f2(n-2) + f2(n-1); //This is not a tail recursion
		
		
	}
	
	/**
	 * 
	 * Solving the problem of Excessive Recursion by using the method of Memoization
	 * 
	 * Memoization: Storing the results of the recursive calls so that it can be utilize later
	 * 
	 * @param args
	 */

	static int FA[] = new int[n];
	

	
	static int f3(int n) {
		
		
		
		if(n<=1) {
			FA[n] = n;
			return n;
		}
		
		if(FA[n-2] == -1)
			FA[n-2] = f3(n-2);

		if(FA[n-1] == -1)
			FA[n-1] = f3(n-1);
		
		return FA[n-2] + FA[n-1];
		
		
	}
	
	
	public static void main(String[] args) {
	
		Arrays.fill(FA, -1);
	    
	    
		
		//Iterative call
		long start = System.nanoTime();
		
		System.out.println("Iterative: " + f1(n));
		
		long end = System.nanoTime();;

	    System.out.println((end - start) + " ns");
		
	    
	    
	    
	    
		//Excessive Recursive call
	    start = System.nanoTime();
		
	    System.out.println("Excessive Recursion: " + f2(n));
		
		end = System.nanoTime();;

	    System.out.println((end - start) + " ms");

	    
	    

		
		//Recursive call using Memoization method
	    start = System.nanoTime();
		
	    System.out.println("Recursive Call using Memoization: " + f3(n));

		end = System.nanoTime();;

	    System.out.println((end - start) + " ms");
		
	}

}












