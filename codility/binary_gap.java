package codility_test;


public class binary_gap {
	public int solution(int N) {
		int gap = -1;
		int max_gap = 0;
		int r = 0;
		
		while (N > 0) {
			// get right most bit & shift right
			r = N & 1;
			N = N >> 1;
			
			if (r == 0 && gap >= 0) {
				gap++;
			}
			if (r == 1) {
				max_gap = gap > max_gap ? gap : max_gap;
				gap = 0;
			}
		}
		
		return max_gap;
	}
}
