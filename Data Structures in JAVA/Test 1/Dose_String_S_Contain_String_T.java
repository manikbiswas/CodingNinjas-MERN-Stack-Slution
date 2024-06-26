public class Solution {
	public static boolean checkSequence(String a, String b) {
		/*
		 * Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		return checkSequence(a, b, 0, 0);
	}

	public static boolean checkSequence(String a, String b, int a_idx, int b_idx) {
		if (b_idx == b.length()) {
			return true;
		}
		if (a_idx == a.length()) {
			return false;
		}
		if (b.charAt(b_idx) == a.charAt(a_idx)) {
			return checkSequence(a, b, a_idx + 1, b_idx + 1);
		} else {
			return checkSequence(a, b, a_idx + 1, b_idx);
		}
	}
}