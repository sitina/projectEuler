package net.sitina.projectEuler.problems.p001;

public class Problem001 {

	// from http://projecteuler.net/problem=1
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(findSum(1000));
	}
	
	/**
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
	 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * 
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 */
	public static long findSum(int range) {
		long sum = 0;
		
		for (int i = 0; i < range; i++) {
			sum += (i % 3 == 0 || i % 5 == 0) ? i : 0;
		}
		
		return sum;
	}

}
