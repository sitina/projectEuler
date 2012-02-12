package net.sitina.projectEuler.problems.p010;

public class Problem010 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getSumOfPrimes(2000000));
	}

	private static long getSumOfPrimes(long limit) {
		int N = (int) limit + 1;

		// initially assume all integers are prime
		boolean[] isPrime = new boolean[N + 1];
		for (int i = 2; i <= N; i++) {
			isPrime[i] = true;
		}

		// mark non-primes <= N using Sieve of Eratosthenes
		for (int i = 2; i * i <= N; i++) {

			// if i is prime, then mark multiples of i as nonprime
			// suffices to consider mutiples i, i+1, ..., N/i
			if (isPrime[i]) {
				for (int j = i; i * j <= N; j++) {
					isPrime[i * j] = false;
				}
			}
		}

		// sum primes
		long sum = 0;
		for (int i = 2; i <= N; i++) {
			if (isPrime[i] && i < limit) {
				sum += i;
			}
		}

		return sum;
	}

}
