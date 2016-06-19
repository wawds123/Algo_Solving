package codility_test;
/**
 * A zero-indexed array A consisting of N integers is given.
 * Rotation of the array means that each element is shifted right by one index,
 * andthe last element of the array is also moved to the first place.
 * 
 * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7].
 * The goal is to rotate array A K times; that is, each element of A will be shifted to the right by K indexes.
 * 
 * 
 * 
 * */



public class CyclicRotation {
	public int[] solution(int[] A, int K) {
		if (A.length == 0)
			return A;
		
		if (K < 1){
			return A;
		}
		// 새로운 배열에 shift한 값을 넣음
		int[] T = new int[A.length];
		
		T[0] = A[A.length - 1];
		
		for (int i = 1; i < A.length; i++)
			T[i] = A[i-1];
		
		// 새로운 배열을 재귀 돌림
		A = solution(T, K-1);
		return A;
	}
}
