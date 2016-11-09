package codility;

import java.util.stream.IntStream;

/**
 * Created by cislo on 11/9/16.
 */
public class PermMissingElem {
    public int solution(int[] A) {
        long N = A.length + 1;
        return (int) (N*(N+1)/2 - IntStream.of(A).mapToLong(x -> x).sum());
    }
}
