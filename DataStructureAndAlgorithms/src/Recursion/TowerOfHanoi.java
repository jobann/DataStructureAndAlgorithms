package Recursion;

import java.util.ArrayList;

public class TowerOfHanoi {

	/**
	 * 
	 * @param n: number of discs on current tower
	 * @param A: current Tower
	 * @param B: Auxiliary Tower
	 * @param C: Target Tower
	 */
	static ArrayList<String> steps = new ArrayList<String>();
	static void TOH(int n, int A, int B, int C) {
		
		if(n>0) {
			
			TOH(n-1, A, C, B);
			System.out.println("Move disc from tower '"+A+"' to tower '"+C+"'");
			steps.add("("+A+","+C+")");
			TOH(n-1, B, A ,C);
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TOH(3, 1, 2, 3);

		System.out.println("\n\nSteps to follow:");
		for(String str: steps)
			System.out.println(str);
		
		int n=2;
		System.out.println(n%10);
		System.out.println(n/10);
		
	}

}
