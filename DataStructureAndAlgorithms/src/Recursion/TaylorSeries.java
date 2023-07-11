package Recursion;

public class TaylorSeries {

	/**
	 * With Complexity O(n^2)
	 * 1 + x + x^2/2! + x^3/3! + .... + n terms
	 * 
	 * @param x : number to calculate series
	 * @param n : precision value (up to how many times to calculate value)
	 * @param p : calculate power (numerator value: x^2, x^3, x^4, .....)
	 * @return
	 */
	
	static double p=1, f=1;
	
	static double e(int x, int n) {
		
		
		double result;
		
		if(n==0) return 1;
		
		result = e(x, n-1);
		
		p = p*x;
		f = f*n;
		
		return result + (double)p/f;
	}
	
	
	/**
	 * With Complexity O(n)
	 *  = 1 + x/1 + x^2/1*2 + x^3/1*2*3 + x^4/1*2*3*4
	 *  = 1 + x/1 [ 1 + x/2 + x^2/2*3 +x^3/2*3*4 ]
	 *  = 1 + x/1 [ 1 + x/2 [ 1 + x/3 + x^2/3*4 ] ]
	 *  = 1 + x/1 [ 1 + x/2 [ 1 + x/3 [ 1 x/4 ] ] ]
	 *  
	 *  
	 * @param args
	 */
	     
	static double result=1;
	static double e1(int x, int n ) {
		
		if(n==0)
			return result;
		
		result = 1 + (double)x/n  * result;

		
		
		return e1(x,n-1);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5, n=20;
		
		System.out.println((double)e(x,n));
		
		System.out.println((double)e1(x,n));
	}

}
