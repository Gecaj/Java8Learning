package codility;

/**
 * Created by cislo on 11/9/16.
 */
public class PermCheck {
    public int solution(int[] A) {
        int[] counts = new int[A.length];
        for (int i : A) {
            if (i > 0 && i-1 < A.length) {
                counts[i-1] += 1;
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (counts[i] == 0) {
                return 0;
            }
        }
        return 1;
    }
}
