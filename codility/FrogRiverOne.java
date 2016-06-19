package codility_test;

/**
 * A small frog wants to get to the other side of a river.
 * The frog is initially located on one bank of the river (position 0) and wants to get to the opposite bank(position X + 1).
 * Leaves fall from a tree onto the surface of the river.
 * 
 * You are given a zero-indexed array A consisting of N integers representing the falling leaves.
 * A[K] represents the position where one leaf falls at time K, measured in seconds.
 * 
 * The goal is to find the earliest time when the frog can jump to the other side of the river.
 * The frog can cross only when leaves appear at every position across the river from 1 to X.
 * You may assume that the speed of the current in the river is negligibly small, the leaves do not change their positions once they fall in the river.
 * 
 * 
 *
 * */

public class FrogRiverOne {
	public int solution(int X, int[] A) {
		int []temp = new int[X];
		int x = 0;
		for (int i = 0; i < A.length; i++) {
			if (temp[A[i]] == 0) {
				temp[A[i]] = A[i];
				x++;
				if (x == X) {
					return i;
				}
			}
		}
		return -1;
	}
}
