package net.sitina.projectEuler.problems.p004;


public class Problem004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		largestPalindrome();
	}
	
	public static void largestPalindrome() {
		long biggest = 0;
		for (int f1 = 999; f1 > 99; f1--) {
			for (int f2 = 999; f2 > 99; f2--) {
				if (f1 * f2 > biggest && isPalindrome(f1 * f2)) {
					biggest = f1 * f2;
					System.out.println("" + f1 + " x " + f2 + " = " + f1 * f2 + " is palindrome");
				}				
			}
		}
	}
	
	public static boolean isPalindrome(long number) {
		String strNum = "" + number;
		
		for (int i = 0; i < strNum.length() / 2; i++) {
			if (strNum.charAt(i) != strNum.charAt(strNum.length() - i - 1)) {
				return false;
			}
		}
		
		return true;
	}

}
