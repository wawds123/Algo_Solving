package codility_test;

import java.util.Arrays;

/**
 * A non-empty zero-indexed array A consisting of N integers is given. Array A represents numbers on a tape.
 * 
 * Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ... A[P - 1] and
 * A[P], A[P+1], ... A[N - 1]
 * 
 * The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P-1]) - (A[P] + A[P+1] + ... A[N-1])|
 * 
 * In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
 * 
 * For example, consider array A such that:
 * A[0] = 3
 * A[1] = 1
 * A[2] = 2
 * A[3] = 4
 * A[4] = 3
 * 
 * We can split this tape in four places:
 * - P = 1, difference = |3 - 10| = 7
 * - p = 2, difference = |4 - 9| = 5
 * - P = 3, difference = |6 - 7| = 1
 * - P = 4, difference = |10 - 3| = 7
 * 
 * 
 * */
public class TapeEquilibrium {
	public int solution(int[] A) {
		int LSide = 0;
		int RSide = 0;
		int[] Num = new int[A.length - 1];
		
		// sets RSide to all the arrays added
		for (int i = 0; i < A.length; i++) {
			RSide += A[i];
		}
		
		for (int i = 0; i < A.length - 1; i++) {
			// removes the first and onwards array from the RSide
			RSide -= A[i];
			
			// Adds the next array to the LSide
			LSide += A[i];
			
			// This allows for absolutes to be calculated
			Num[i] = Math.abs(LSide - RSide);
		}
		
		Arrays.sort(Num);
		
		return Num[0];
	}
}
