public class Solution {

	public static int findUnique(int[] arr) {
	
		int ans = arr[0];
		for (int i = 1; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		return ans;
	}
}