package net.sitina.projectEuler.problems.p007;


public class Problem007 {

	// from http://projecteuler.net/problem=7
	
	public static void main(String[] args) {
		Problem007 p = new Problem007();
		System.out.println(p.findPrimes(10001));
	}
	
	public long findPrimes(int primesCount) {
		int N = primesCount * 100;

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

        // count primes
        int primes = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
            	primes++;
            	if (primes == primesCount) {
            		return i;
            	} 
            }
        }
        
        return -1;
	}
	
}
