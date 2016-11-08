package codility;

/**
 * Created by cislo on 11/8/16.
 */
public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            result[(i+K)%A.length] = A[i];
        }
        return result;
    }

    public static void main(String[] args) {
        CyclicRotation solution = new CyclicRotation();
        for (int i : solution.solution(new int[]{1, 2, 3, 4, 5}, 1)) {
            System.out.print(i + ",");
        }
    }
}
