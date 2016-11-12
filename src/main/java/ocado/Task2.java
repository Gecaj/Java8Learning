package ocado;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task2 {
    public int solution(int[] A) {
        Map<Integer, Long> counts = IntStream.of(A).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        return counts.entrySet().stream().max((e1, e2) -> (int)(e1.getValue() - e2.getValue())).get().getKey();
    }

    public int solution2(int[] A) {
        Arrays.sort(A);
        int occurrences = 1;
        int maxOccurrences = 1;
        int mostFrequent = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i - 1]) {
                occurrences++;
            } else {
                if (occurrences > maxOccurrences) {
                    maxOccurrences = occurrences;
                    mostFrequent = A[i - 1];
                }
                occurrences = 1;
            }

        }
        return (occurrences > maxOccurrences) ? A[A.length - 1] : mostFrequent;
    }
}
