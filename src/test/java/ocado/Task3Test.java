package ocado;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task3Test {
    private Task3 maxPath = new Task3();

    @Test
    public void shouldFindMaxPath() {
        assertThat(maxPath.solution(arr(5, 4, 0, 3, 1, 6, 2))).isEqualTo(4);
        assertThat(maxPath.solution(arr())).isEqualTo(0);
        assertThat(maxPath.solution(arr(0))).isEqualTo(1);
    }

    private int[] arr(int... ints) {
        return ints;  //To change body of created methods use File | Settings | File Templates.
    }
}
