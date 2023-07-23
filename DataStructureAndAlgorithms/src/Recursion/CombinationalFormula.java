package Recursion;

public class CombinationalFormula {

	
	/**
	 * Factorial method
	 */
	
	static int fact(int n) {
		if(n==0) return 1;
		
		return fact(n-1)*n;
		
		
	}
	
	
	/**
	 * Iterative method
	 * 
	 * nCr = n! / ( r! * (n-r)! )
	 * 
	 * 
	 * @param args
	 */
	static int nCr1(int n, int r) {
		
		int t0 = fact(n);
		int t1 = fact(r);
		int t2 = fact(n-r);
		
		return t0/(t1*t2);
		
	}
	
	
	
	/**
	 * Recursion method
	 * 
	 *				0C0
	 *			   /   \
	 *			1C0	 +	1C1
	 *         /   \   /   \
	 *		2C0	 +	2C1  +	2C2
	 *     /   \   /   \   /   \
	 *  3C0		3C1 	3C2 	3C3
	 * 
	 * 
	 * nCr = (n-1)C(r-1) + (n-1)C(r)
	 * 3C2 = 2C1 + 2C2
	 * 
	 * if r=0 or r==n, return 1
	 * (if edge return 1)
	 * 
	 * 
	 * 
	 * @param args
	 */
	static int nCr2(int n, int r) {
		
		if(r==0 || r ==n) return 1;
		
		return nCr2(n-1, r-1) + nCr2(n-1, r);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Iterative call
		long start = System.nanoTime();

		System.out.println("Iterative call: " + nCr1(7,5));
		
		long end = System.nanoTime();;

	    System.out.println((end - start) + " ns");
		
		
	    //Recursive Call
	    start = System.nanoTime();

	    System.out.println("Recursive call: " + nCr2(7,5));
		
		end = System.nanoTime();;

	    System.out.println((end - start) + " ns");
		
				
		
		
		
		
		
		
		

	}

}
