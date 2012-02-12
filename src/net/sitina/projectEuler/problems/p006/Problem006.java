package net.sitina.projectEuler.problems.p006;

public class Problem006 {

	// from http://projecteuler.net/problem=6
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(findSqrDifference(100));
	}
	
	public static long findSqrDifference(long count) {
		long sqrSum = 0;
		long numSum = 0;
		for (int i = 1; i <= count; i++) {
			sqrSum += Math.pow(i, 2);
			numSum += i;
		}
		
		return (long)Math.pow(numSum, 2) - sqrSum;
	}

}
