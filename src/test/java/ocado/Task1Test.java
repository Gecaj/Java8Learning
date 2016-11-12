package ocado;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by cislo on 11/12/16.
 */
public class Task1Test {

    private Task1 median = new Task1();

    @Test
    public void testMedian() {
        assertThat(median.solution(arr(1))).isEqualTo(1);
        assertThat(median.solution(arr(1, 2, 5, 10, 20, 1))).isEqualTo(5);
    }

    private int[] arr(int... a) {
        return a;
    }

}