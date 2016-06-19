package codility_test;
/**
 * A non-empty zero-indexed array A consisting of N integers is given.
 * A permutation is a sequence containing each element from 1 to N once, and only once.
 * 
 * For example, array A such that:
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * A[3] = 2
 * is a permutation, but array A such that:
 * 
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * is not a permutation, because value 2 is missing.
 * 
 * The goal is to check whether array A is a permutation.
 * 
 * */


public class PermCheck {
	public int solution (int[] A) {
		int [] mark = new int[A.length + 1];
		int count = 0;
		
		for (int i = 0; i < A.length; i++) {
			int value = A[i];
			if (value >= mark.length)
				return 0;
			if (mark[value] == 0) {
				mark[value] = 1;
				++count;
			} else {
				return 0;
			}
		}
		
		return count == A.length ? 1 : 0;
	}
}
