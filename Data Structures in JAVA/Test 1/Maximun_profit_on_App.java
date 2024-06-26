import java.util.*;
import java.lang.*;

public class solution {

	public static int maximumProfit(int budget[]) {

		Arrays.sort(budget);
	

		int ans = Integer.MIN_VALUE;
		int n = budget.length;
	
		for (int i = 0; i < n; i++) {
			ans = Math.max(ans, budget[i] * (n - i));
		}
		return ans;

	}
}