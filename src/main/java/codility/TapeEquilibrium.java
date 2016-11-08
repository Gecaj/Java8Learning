package codility;

import java.util.stream.IntStream;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int lSum = 0;
        int rSum = IntStream.of(A).sum();
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            lSum += A[i];
            rSum -= A[i];
            minDiff = Math.min(minDiff, Math.abs(lSum - rSum));
        }
        return minDiff;
    }

    public static void main(String[] args) {
        System.out.println(new TapeEquilibrium().solution(new int[]{-1000, 1000}));
    }


}
