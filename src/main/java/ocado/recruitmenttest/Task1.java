package ocado.recruitmenttest;

import java.util.Arrays;

public class Task1 {
    public int solution(int[] A) {
        Arrays.sort(A);
        int minDist = Integer.MAX_VALUE;
        for (int i = 1; i < A.length; i++) {
            minDist = Math.min(minDist, A[i]-A[i-1]);
        }
        return minDist;
    }
}
