package codility_test;


/**
 * You are given N counters, initially set to 0, and you have two possible operations on them:
 * - increase(X) - counter X is increased by 1,
 * - max counter : all counters are set to the maximum value of any counter.
 * 
 * A non-empty zero-indexed array A of M integers is given. This array represents consecutive operations:
 * - if A[K] = X, such that 1 <= X <= N, then operation K is increase(X),
 * - if A[K] = N + 1 then operation K is max counter.
 * 
 * 
 * */
public class MaxCounters {
	
	public int[] solution (int N, int[] A) {
		int M = A.length;
		int[] counters = new int[N];
		int maxValue = 0;	// store the max value in the counters array
		int currMax = 0;	// store the max value when there tis a max counter
		
		for (int i = 0; i < M; i++) {
			if (A[i] >= 1 && A[i] <= N) {
				// max counter
				if (counters[A[i] - 1] < currMax)
					counters[A[i] - 1] = currMax;
				
				// increase (X)
				counters[A[i] - 1]++;
				if (counters[A[i] - 1] > maxValue)
					maxValue = counters[A[i] - 1];
			}
			
			// update current max value when there is a max counter
			if (A[i] == N + 1)
				currMax = maxValue;
		}
		
		for (int i = 0; i < N; i++) {
			// update the rest elements of counters which aren't assigned above.
			if (counters[i] < currMax)
				counters[i] = currMax;
			
			
		}
		
		return counters;
	}
}
