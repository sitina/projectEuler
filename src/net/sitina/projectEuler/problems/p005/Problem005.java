package net.sitina.projectEuler.problems.p005;

public class Problem005 {

	// from http://projecteuler.net/problem=5
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		findDivisible(20);
	}
	
	public static long findDivisible(int numbers) {
		long num = 0 + numbers;
		while (true) {
			boolean ok = true;
			for (int i = 2; i <= numbers; i++) {
				if (num % i != 0) {
					ok = false;
					break;
				}
			}
			if (ok) {
				System.out.println("Vyhralo cislo " + num);
				return num;
			} else {
				num = num + numbers;
			}
		}
	}

}
