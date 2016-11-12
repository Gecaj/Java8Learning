package ocado;

import java.util.Arrays;

/**
 * Created by cislo on 11/12/16.
 */
public class Task1 {

    public int solution(int[] A) {
        Arrays.sort(A);
        return A.length % 2 == 0 ? A[A.length/2] : A[(A.length-1)/2];
    }
}
