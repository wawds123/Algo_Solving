package codility_test;

import java.util.Arrays;

/**
 * that, given a non-empty zero-inexed array A of N integers, returns the minimal positive integer (greater than 0)
 * that does not occur in A.
 * 
 * For example, given:
 * 
 * 
 * */
public class MissingInteger {
	public int solution (int [] A) {
		Arrays.sort(A);
		int cal = (A.length * (A.length + 1)) / 2;
		int i = 0;
		while (i < A.length) {
			if (A[i] == A[i+1])
				i+=2;
			cal -= A[i];
		}
		
		return cal;
	}
}
