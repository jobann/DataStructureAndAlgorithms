package Recursion;

public class TaylorSeries {

	/**
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((double)e(4,30));
	}

}
