package codility_test;

import java.util.Arrays;

/**
 * A non-empty zero-indexed array A consisting of N integers is given.
 * The array contains an odd number of elements,
 * and each element of the array can be paired with another element
 * that has the same value, except for one element that is left unpaired.
 * 
 * For example, in array A such that:
 * 
 * A[0] = 9		A[1] = 3	A[2] = 9
 * A[3] = 3		A[4] = 9	A[5] = 7
 * A[6] = 9
 * 
 * - the elements at indexes 0 and 2 have value 9,
 * - the elements at indexes 1 and 3 have value 3,
 * - the elements at indexes 4 and 6 have value 9,
 * - the element at index 5 has value 7 and is unpaired.
 * 
 * */
public class OddOccurrencesInArray {

	public int solution(int [] A) {
		Arrays.sort(A);
		int oddNumber = A[A.length - 1];
		for (int i = 1; i < A.length; i+=2) {
			if (A[i-1] == A[i])
				continue;
			else {
				if (A[i] == A[i+1]) {
					oddNumber = A[i-1];
					break;
				} else {
					oddNumber = A[i+1];
					break;
				}
			}
		}
		return oddNumber;
	}
}
