package net.sitina.projectEuler.problems.p009;

public class Problem009 {

	// from http://projecteuler.net/problem=8
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(findTriplet());
	}
	
	private static long findTriplet() { 
		int a = 1;
		int b = 1;
		int c = 1;
		
		// a + b + c = 1000
		// a * a + b * b = c * c
		// a < b < c
		for (a = 1; a < 1000; a++) {
			for (b = a + 1; b < 1000; b++) {
				for (c = b + 1; c < 1000; c++) {
					if (a + b + c == 1000 && a * a + b * b == c * c) {
						System.out.println(a);
						System.out.println(b);
						System.out.println(c);
						return a * b * c;
					}
				}
			}
		}
		
		return -1;
	}

}
