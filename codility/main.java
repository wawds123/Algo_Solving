package codility_test;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.close();
		
		//binary_gap binarygap = new binary_gap();
		//System.out.println(binarygap.solution(N));
//		CyclicRotation cr = new CyclicRotation();
//		int A[] = {3, 8, 9, 7, 6};
//		int T[] = cr.solution(A, 3);
//		for (int i = 0; i < T.length; i++) {
//			System.out.print(T[i] + " ");
//		}
		
//		OddOccurrencesInArray ooi = new OddOccurrencesInArray();
//		int A[] = {9, 3, 9, 3, 9,7,9};
//		System.out.println(ooi.solution(A));
//		FrogJmp fj = new FrogJmp();
//		System.out.println(fj.solution(10, 85, 30));
		
		TapeEquilibrium te = new TapeEquilibrium();
		int A[] = {3,1,2,4,3};
		System.out.println(te.solution(A));
		
	}
}
