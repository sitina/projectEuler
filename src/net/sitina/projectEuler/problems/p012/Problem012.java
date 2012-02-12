package net.sitina.projectEuler.problems.p012;

public class Problem012 {

	private long[] naturalNumbers = new long[10000];
	
	public static void main(String[] args) {
		Problem012 p = new Problem012();

		for (int i = 1; i < 10000; i++) {
			long res = p.getNaturalNumber(i);
			int count = p.getFactors(res);
			
			if (count == 500) {
				System.out.println(res);
				System.out.println("count " + count);
				return;
			}
			
			if (i % 1000 == 0) {
				System.out.println(i + ". " + res + " " + count);
			}
		}
	}
	
	public Problem012() {
		naturalNumbers[0] = 0;
		naturalNumbers[1] = 1;
	}
	
	private long getNaturalNumber(long order) {
		if (order > 1 && naturalNumbers[(int)order - 1] == 0) {
			 getNaturalNumber(order - 1);
		}
		
		naturalNumbers[(int)order] = naturalNumbers[(int)order - 1] + order;
		return naturalNumbers[(int)order];
	}
	
	private int getFactors(long number) {
		int count = 0;
		
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				// System.out.print(i + " ");
				count++;
			}
		}
		count++;
		
		return count;
	}
	
}
