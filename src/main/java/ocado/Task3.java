package ocado;

import java.util.HashSet;

public class Task3 {

    public int solution(int[] A) {
        HashSet<Integer> excluded = new HashSet<>();
        int pathLength;
        int maxPathLength = 0;
        for (int i : A) {
            if (!excluded.contains(i)) {
                pathLength = countPath(i, A, excluded);
                if (pathLength > maxPathLength) {
                    maxPathLength = pathLength;
                }

            }
        }
        return maxPathLength;
    }

    private int countPath(int i, int[] a, HashSet<Integer> excluded) {
        int length = 1;
        int nextIndex = a[i];
        while (nextIndex != i) {
            excluded.add(nextIndex);
            length++;
            nextIndex = a[nextIndex];
        }
        return length;
    }
}
