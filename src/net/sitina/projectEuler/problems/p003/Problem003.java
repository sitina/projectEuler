package net.sitina.projectEuler.problems.p003;

public class Problem003 {

	// from http://projecteuler.net/problem=3
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		for (int i = 10; i < 50; i++) {
//			System.out.println("" + i);
//			eratostheles(1, i);
//			System.out.println();
//		}
		eratostheles(1, 600851475143L);
	}
	
	public static void eratostheles(long start, long number) {		
		for (long i = start + 1; i < number; i++) {
			if (number % i == 0) {
				System.out.print(" " + i);
				eratostheles(i, number / i);
				return;
			}
		}
		System.out.print(" " + number);
	}

}
