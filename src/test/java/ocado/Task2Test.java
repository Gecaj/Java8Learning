package ocado;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task2Test {
    private Task2 maxOccurrences = new Task2();

    @Test
    public void shouldCountMaxOccurrences() {
        assertThat(maxOccurrences.solution(arr(20, 10, 30, 30, 40, 10))).isEqualTo(10);
        assertThat(maxOccurrences.solution(arr(15))).isEqualTo(15);
        assertThat(maxOccurrences.solution(arr(1, 2, 2))).isEqualTo(2);
        long start = System.currentTimeMillis();
        int solution = maxOccurrences.solution(createRandomArr());
        System.out.println("solution = " + solution);
        System.out.println("10,000,000 array took: " + (System.currentTimeMillis() - start) + " ms.");
    }

    private int[] arr(int... a){
        return a;
    }

    private int[] createRandomArr() {
        int[] arr = new int[10000000];
        for (int i = 0; i < 10000000; i++) {
            arr[i] = (int)(Math.random()*500);
        }
        return arr;
    }
}
